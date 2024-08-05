package org.lili.mapping.impl;

import org.apache.log4j.Logger;
import org.lili.converters.ConversionException;
import org.lili.mapping.FieldSetBuilder;
import org.lili.mapping.FieldSetLevelHelper;
import org.springframework.cache.annotation.Cacheable;

import java.lang.reflect.*;
import java.sql.Time;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.*;

/**
 * @packgeName: org.lili.mapping.impl
 * @ClassName: DefaultFieldSetBuilder
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/16-12:48
 * @version: 1.0
 * @since: JDK 1.8
 */

public class DefaultFieldSetBuilder implements FieldSetBuilder{

    private final static Logger LOG = Logger.getLogger(DefaultFieldSetBuilder.class);

    private int defaultRecurrencyLevel = 4;

    private int defaultMaxFieldSetSize = 50000;

    private Set<Class> simpleClassSet;

    private FieldSetLevelHelper fieldSetLevelHelper;

    public int getDefaultRecurrencyLevel() {
        return defaultRecurrencyLevel;
    }

    public void setDefaultRecurrencyLevel(int defaultRecurrencyLevel) {
        this.defaultRecurrencyLevel = defaultRecurrencyLevel;
    }

    public int getDefaultMaxFieldSetSize() {
        return defaultMaxFieldSetSize;
    }

    public void setDefaultMaxFieldSetSize(int defaultMaxFieldSetSize) {
        this.defaultMaxFieldSetSize = defaultMaxFieldSetSize;
    }

    public DefaultFieldSetBuilder() {

        simpleClassSet = new HashSet<Class>(Arrays.asList(Byte.class, Short.class,
                Integer.class, Long.class,
                Boolean.class, Character.class,
                Float.class, String.class,
                Date.class, Time.class, Object.class));
    }


    @Override
    @Cacheable(value = "fieldSetCache", key = "{#clazz,#fieldPrefix,#configuration}")
    public Set<String> createFieldSet(Class clazz, String fieldPrefix, String configuration) {
        return createFieldSet(clazz,fieldPrefix,configuration,null);
    }


    @Override
    @Cacheable(value = "fieldSetCache", key = "{#clazz,#fieldPrefix,#configuration,#context}")
    public Set<String> createFieldSet(Class clazz, String fieldPrefix,
                                  String configuration, FieldSetBuilderContext context) {
        if(context == null) {
            context = new FieldSetBuilderContext();
            context.setRecurrencyLevel(getDefaultRecurrencyLevel());
            context.setMaxFieldSetSize(getDefaultMaxFieldSetSize());
        }
        context.resetFieldCounter();
        context.resetRecurrencyMap();
        return createFieldSetInternal(clazz,fieldPrefix,configuration,context);
    }

    /**
     * 核心代码
     * createFieldSetInternal(AddressData.class,"address","firstName, lastName") will return set
     * {address.firstName,address.lastName}
     *
     * createFieldSetInternal(AddressData.class,"address","BASIC,town") when definition for BASIC level
     * ="firstName, lastName" will return {address.firstName,address.lastName,address.town}
     *
     * 递归调用
     * @param clazz
     * @param fieldPrefix  字段前缀
     * @param configuration
     * @param context
     * @return
     */
    private Set<String> createFieldSetInternal(Class clazz, String fieldPrefix,
                                           String configuration, FieldSetBuilderContext context) {

        final Set<String> fieldSet = new HashSet<>();
        if(configuration==null || configuration.isEmpty()){
            return fieldSet;
        }
        //"address","firstName, lastName"
        configuration = configuration.trim();
        int length = configuration.length();
        if(configuration.charAt(length-1) == ',' || configuration.charAt(length-1)=='('){
            throw new ConversionException("Incorrect configuration");
        }

        int currentPos = 0;
        String elementName = "";

        while(currentPos<configuration.length()){

            elementName = getElementName(currentPos,configuration);

            currentPos = currentPos + elementName.length();

            elementName = elementName.trim();
            //(AddressData.class,"address","BASIC,town")
            if(getFieldSetLevelHelper().isLevelName(elementName,clazz)) {
                //递归开始
                fieldSet.addAll(createFieldSetForLevel(clazz, fieldPrefix, elementName, context));

            } else {

                final Type fieldType = getFieldType(elementName,clazz);
                final String fullFieldName = createFullFieldName(fieldPrefix, elementName);
                //最复杂的方法
                currentPos = parseComplexField(configuration, currentPos, fullFieldName, fieldType, fieldSet, context);
            }
            //省略逗号
            currentPos = omitComma(currentPos, configuration);
        }
        return fieldSet;
    }



    private int parseComplexField(String configuration, int currentPos,
                                  String fullFieldName, Type fieldType,
                                  Set<String> fieldSet, FieldSetBuilderContext context) {

        if(fieldType instanceof ParameterizedType){
            //参数化类型
            final ParameterizedType parametrizedType = (ParameterizedType) fieldType;
            final Type rawType = parametrizedType.getRawType();

            if(Map.class.isAssignableFrom((Class<?>) rawType)){
                return parseMapField(configuration, currentPos,
                        fullFieldName, (ParameterizedType) fieldType,
                        fieldSet, context);


            }else if(Collection.class.isAssignableFrom((Class<?>)rawType)){
                return parseComplexField(configuration, currentPos,
                        fullFieldName, parametrizedType.getActualTypeArguments()[0],
                        fieldSet, context);
            }else{
                return parseField(configuration,currentPos,
                        fullFieldName,parametrizedType.getActualTypeArguments()[0],
                        fieldSet,context);

            }

        }else if(fieldType instanceof WildcardType){

            //通配符类型
            final WildcardType wildcardType = (WildcardType) fieldType;
            final Type[] lowerBounds = wildcardType.getLowerBounds();
            if(lowerBounds!=null && lowerBounds.length>0 && lowerBounds[0]!=null){
                return parseComplexField(configuration,currentPos,
                        fullFieldName,wildcardType.getUpperBounds()[0],
                        fieldSet,context);
            }else{
                return parseComplexField(configuration, currentPos,
                        fullFieldName, wildcardType.getUpperBounds()[0],
                        fieldSet, context);
            }
        }else if(fieldType instanceof TypeVariable){
            //类型变量
            final TypeVariable typeVariable = (TypeVariable) fieldType;
            if(context.getTypeVariableMap()!=null && context.getTypeVariableMap().containsKey(typeVariable.getName())){
                return parseComplexField(configuration, currentPos, fullFieldName,
                        context.getTypeVariableMap().get(typeVariable.getName()), fieldSet, context);
            }else{
                return parseComplexField(configuration, currentPos, fullFieldName, Object.class, fieldSet, context);
            }

        }else{
            //GenericArrayType???
            return parseField(configuration, currentPos, fullFieldName, fieldType, fieldSet, context);
        }
    }

    private int parseField(String configuration, int currentPos, String fullFieldName, Type fieldType, Set<String> fieldSet, FieldSetBuilderContext context) {
        final Class fieldClass = getClassForType(fieldType);
        currentPos =omitSpace(currentPos,configuration);
        if(currentPos<configuration.length() && configuration.charAt(currentPos)=='('){
            //关闭括号
            final int confEnd = findMatchingCloseBracket(configuration,currentPos);
            if(confEnd!=-1){
                final String fieldConf = configuration.substring(currentPos+1,confEnd);
                if(!fieldConf.isEmpty() && isSimpleClass(fieldClass)){

                    throw new ConversionException("Incorrect configuration : field '" + fullFieldName + "' don't need configuration");
                }
                if(!context.isRecurencyLevelExceeded(fieldClass)){
                    context.addToRecurrencyMap(fieldClass);
                    fieldSet.addAll(createFieldSetInternal(fieldClass, fullFieldName, fieldConf, context));
                    context.removeFromRecurrencyMap(fieldClass);
                }
            }else{

                throw new ConversionException("Incorrect configuration : Missing ')'");
            }

        }else if(!isSimpleClass(fieldClass)){
            //非简单类型
            if (!context.isRecurencyLevelExceeded(fieldClass)) {

                context.addToRecurrencyMap(fieldClass);
                fieldSet.addAll(createFieldSetInternal(fieldClass, fullFieldName, FieldSetLevelHelper.BASIC_LEVEL, context));
                context.removeFromRecurrencyMap(fieldClass);
            }
        }

        addToFieldSet(fieldSet,fullFieldName,context);

        return currentPos;

    }

    //寻找关闭的括号
    private int findMatchingCloseBracket(String configuration, int openPos) {
        int closePos = openPos + 1;
        int counter = 1;
        while(counter>0 && closePos < configuration.length()){
            final char c = configuration.charAt(closePos++);
            if(c=='('){
                counter++;
            }else if(c==')'){
                counter--;
            }
        }
        if(counter==0){
            return --closePos;
        }
        return -1;
    }

    private void addToFieldSet(Set<String> fieldSet, String fullFieldName, FieldSetBuilderContext context) {
        //超过最大字段限制
        if(!context.isMaxFieldSetSizeExceeded()){
            fieldSet.add(fullFieldName);
            context.incrementFieldCounter();
        }else{

            throw new ConversionException("Max field set size exceeded. " +
                    "Reason of that can be : too generic configuration, lack " +
                    "of properly defined BASIC field set level for data class, " +
                    "reccurency in data structure");

        }
    }

    protected boolean isSimpleClass(Class clazz) {
        if (clazz.isPrimitive() || clazz.isEnum() ||
                getSimpleClassSet().contains(clazz) ||
                Number.class.isAssignableFrom(clazz)
                || HybrisEnumValue.class.isAssignableFrom(clazz)) {
            return true;
        }
        return false;
    }


    public Set<Class> getSimpleClassSet() {
        return simpleClassSet;
    }

    public void setSimpleClassSet(Set<Class> simpleClassSet) {
        this.simpleClassSet = simpleClassSet;
    }

    private Class getClassForType(Type fieldType) {

        Class fieldClass = Object.class;
        if(fieldType instanceof Class){
            fieldClass = (Class) fieldType;
            if(fieldClass.isArray()){
                fieldClass = fieldClass.getComponentType();
            }
        }
        return fieldClass;
    }

    private int parseMapField(String configuration, int currentPos, String fieldName, ParameterizedType fieldType, Set<String> fieldSet, FieldSetBuilderContext context) {

        String mapConf = "";
        currentPos = omitSpace(currentPos, configuration);
        if (currentPos < configuration.length() && configuration.charAt(currentPos) == '(') {
            final int confEnd = findMatchingCloseBracket(configuration, currentPos);
            if (confEnd != -1) {
                mapConf = configuration.substring(currentPos + 1, confEnd).trim();
            } else {
                throw new ConversionException("Incorrect map configuration : Missing ')'");
            }
            currentPos = omitBracket(confEnd, configuration);
        }

        final Type keyType = fieldType.getActualTypeArguments()[0];
        final String keyFieldName = createFullFieldName(fieldName,"key");
        int pos = parseComplexField(mapConf, 0, keyFieldName, keyType, fieldSet, context);

        final Type valueType = fieldType.getActualTypeArguments()[1];
        final String valueFieldName = createFullFieldName(fieldName, "value");
        pos = parseComplexField(mapConf, pos, valueFieldName, valueType, fieldSet, context);

        if(pos < mapConf.length()){
            throw new ConversionException("Incorrect map configuration : '" + mapConf + "'");

        }

        addToFieldSet(fieldSet, fieldName, context);

        return currentPos;

    }

    //忽略括号
    private int omitBracket(final int startIndex, final String configuration) {
        int index = omitSpace(startIndex, configuration);
        if (index < configuration.length() && configuration.charAt(index) == ')') {
            index++;
        }
        return index;
    }


    private int omitComma(int startIndex, String configuration) {

        int index = omitSpace(startIndex,configuration);
        if(index<configuration.length() && configuration.charAt(index)==','){
            index++;
        }
        return index;
    }

    private int omitSpace(int startIndex, String configuration) {
        int index = startIndex;
        while (index < configuration.length() && configuration.charAt(index) <= ' ')
        {
            index++;
        }
        return index;
    }


    private String createFullFieldName(String basePrefix, String fieldName) {
        final String prefix;
        if (basePrefix == null || basePrefix.isEmpty()) {
            prefix = fieldName;
        }else{
            prefix = basePrefix + "." + fieldName;
        }
        return prefix;
    }

    protected Type getFieldType(String fieldName, Class objectClass) {
        if (fieldName == null || fieldName.isEmpty())  {
            throw new ConversionException("Incorrect field: field name is empty string");
        }
        Class clazz = objectClass;
        while (clazz != null) {
            try {
                final Field fieldField = clazz.getDeclaredField(fieldName);
                return fieldField.getGenericType();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        throw new ConversionException("Incorrect field:'" + fieldName + "'");
    }

    private Set<String> createFieldSetForLevel(Class clazz,
                                                                String prefix,
                                                                String levelName,
                                                                FieldSetBuilderContext context) {
        String levelDef = fieldSetLevelHelper.getLevelDefinitionForClass(clazz,levelName);
        if (levelDef == null) {
            if(FieldSetLevelHelper.BASIC_LEVEL.equals(levelName)){

                levelDef = fieldSetLevelHelper.createBasicLevelDefinition(clazz);

            }else if(FieldSetLevelHelper.DEFAULT_LEVEL.equals(levelName)){

                levelDef = fieldSetLevelHelper.createDefaultLevelDefinition(clazz);

            }else if(FieldSetLevelHelper.FULL_LEVEL.equals(levelName)){

                levelDef = fieldSetLevelHelper.createFullLevelDefinition(clazz);
            }
        }
        return createFieldSetInternal(clazz, prefix, levelDef, context);
    }

    public FieldSetLevelHelper getFieldSetLevelHelper() {
        return fieldSetLevelHelper;
    }

    public void setFieldSetLevelHelper(FieldSetLevelHelper fieldSetLevelHelper) {
        this.fieldSetLevelHelper = fieldSetLevelHelper;
    }


    private String getElementName(int startIndex, String configuration) {
        final int elementEnd = findElement(startIndex,configuration);
        return configuration.substring(startIndex, elementEnd);
    }

    private int findElement(int startIndex, String configuration) {
        int index = startIndex;
        while (index < configuration.length()){
            final char  c = configuration.charAt(index);
            if(c=='(' || c==',' ){
                return index;
            }
            index++;
        }
        return configuration.length();
    }
}

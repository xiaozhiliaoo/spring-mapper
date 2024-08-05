package org.lili.mapping.impl;

import org.lili.mapping.FieldSetLevelHelper;
import org.lili.mapping.config.FieldSetLevelMapping;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * @packgeName: org.lili.mapping.impl
 * @ClassName: DefaultFieldSetLevelHelper
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/16-12:49
 * @version: 1.0
 * @since: JDK 1.8
 */

public class DefaultFieldSetLevelHelper implements FieldSetLevelHelper,ApplicationContextAware {

    //levelMap ={dtoClass，Map<String, String>}
    private Map<Class, Map<String, String>> levelMap;

    public Map<Class, Map<String, String>> getLevelMap() {
        return levelMap;
    }

    public void setLevelMap(Map<Class, Map<String, String>> levelMap) {
        this.levelMap = levelMap;
    }

    @Override
    public boolean isLevelName(String levelName, Class objectClass) {
        if (BASIC_LEVEL.equals(levelName) || DEFAULT_LEVEL.equals(levelName) || FULL_LEVEL.equals(levelName)) {
            return true;
        }
        final Map<String,String> map = getLevelMapForClass(objectClass);
        return map==null?false:map.containsKey(levelName);
    }

    private Map<String,String> getLevelMapForClass(Class objectClass) {
        return getLevelMap().get(objectClass);
    }

    @Override
    public String createBasicLevelDefinition(Class objectClass) {
        //map = {等级，描述}
        Map<String, String> map = getLevelMapForClass(objectClass);
        if (map == null) {
            map = new HashMap<>();
            getLevelMap().put(objectClass,map);
        }

        String levelDefinition = "";
        final Field[] fieldList = objectClass.getDeclaredFields();
        for (Field field : fieldList) {
            //非静态 ， 非final
            if(!Modifier.isStatic(field.getModifiers()) && !Modifier.isFinal(field.getModifiers())){
                levelDefinition = levelDefinition + field.getName() + ",";
            }
        }
        if(!levelDefinition.isEmpty()){
            levelDefinition = levelDefinition.substring(0,levelDefinition.length()-1);
        }
        map.put(BASIC_LEVEL,levelDefinition);
        return levelDefinition;
    }

    @Override
    public String createFullLevelDefinition(Class objectClass) {

        Map<String,String> map = getLevelMapForClass(objectClass);
        if (map == null) {
            map = new HashMap<>();
            getLevelMap().put(objectClass,map);
        }

        String levelDefinition = "";
        //查找子类到父类的所有字段
        while(objectClass!=null && objectClass!=Object.class){
            //包含所有访问权限字段，不包括父类
            Field[] fieldList = objectClass.getDeclaredFields();
            for (Field field : fieldList) {
                //去除static final 类型字段
                if(! Modifier.isStatic(field.getModifiers()) &&  ! Modifier.isFinal(field.getModifiers())){
                    levelDefinition = levelDefinition + field.getName() + ",";
                }
            }
            objectClass = objectClass.getSuperclass();
        }
        if(!levelDefinition.isEmpty()){
            levelDefinition = levelDefinition.substring(0, levelDefinition.length() - 1);
        }
        map.put(FULL_LEVEL, levelDefinition);
        return levelDefinition;
    }

    @Override
    public String createDefaultLevelDefinition(Class objectClass) {
        Map<String, String> map = getLevelMapForClass(objectClass);
        if (map == null) {
            map = new HashMap<String, String>();
            getLevelMap().put(objectClass, map);
        }

        String levelDefinition = "";

        final Field[] fieldList = objectClass.getDeclaredFields();
        for (final Field field : fieldList) {
            if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isFinal(field.getModifiers())) {

                levelDefinition = levelDefinition + field.getName() + ",";
            }
        }

        if (!levelDefinition.isEmpty()) {

            levelDefinition = levelDefinition.substring(0, levelDefinition.length() - 1);
        }

        map.put(DEFAULT_LEVEL, levelDefinition);
        return levelDefinition;
    }

    @Override
    public String getLevelDefinitionForClass(Class objectClass, String levelName) {

        final Map<String,String> map = getLevelMapForClass(objectClass);
        if (map != null) {
            return map.get(levelName);
        }
        return null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        buildLevelMap(applicationContext);

    }

    protected void buildLevelMap(ApplicationContext applicationContext) {
        levelMap = new HashMap<>();
        final Map<String,FieldSetLevelMapping> mappings =
                BeanFactoryUtils.beansOfTypeIncludingAncestors(applicationContext,FieldSetLevelMapping.class);
        for (FieldSetLevelMapping mapping : mappings.values()) {
            addToLevelMap(mapping);
        }
        
    }

    //levelMap
    protected void addToLevelMap(FieldSetLevelMapping mapping) {

        if(levelMap.containsKey(mapping.getDtoClass())){
            final Map<String,String> existingMap = levelMap.get(mapping.getDtoClass());
            String levelDefinition;
            for (Map.Entry<String, String> entry : mapping.getLevelMapping().entrySet()) {
                if(existingMap.containsKey(entry.getKey())){
                    levelDefinition = existingMap.get(entry.getKey())+","+entry.getValue();
                    existingMap.put(entry.getKey(),levelDefinition);
                }else{
                    existingMap.put(entry.getKey(), entry.getValue());
                }
            }
        }else{
            levelMap.put(mapping.getDtoClass(),mapping.getLevelMapping());
        }
    }
}

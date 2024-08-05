package org.lili.mapping.impl;
import java.util.*;
/**
 * @packgeName: org.lili.mapping.impl
 * @ClassName: FieldSetBuilderContext
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-19:29
 * @version: 1.0
 * @since: JDK 1.8
 */

/**
 * 存储FieldSetBuilder信息
 */
public class FieldSetBuilderContext {

    //typeVariableMap- map containing information about types used in generic class
   //	e.g. if we have type class like ProductSearchPageData<STATE, RESULT> we should give map like
   //{STATE=SearchStateData.class, RESULT=ProductData.class}
    private Map<String, Class> typeVariableMap;

    //define how many recurrency level builder should support (it is case when object
    //	 have it's own type field e.g. VariantMatrixElementData have elements which are also
    //   VariantMatrixElementData type)
    private int recurrencyLevel = 4;

    //map for controlling recurrency level
    private Map<Class, Integer> recurrencyMap = new HashMap<>();

    private int fieldCounter = 0;

    private int maxFieldSetSize = 50000;

    //计数
    public void addToRecurrencyMap(final Class clazz){
        if(recurrencyMap != null){
            if(recurrencyMap.containsKey(clazz)){
                Integer value = recurrencyMap.get(clazz);
                value = Integer.valueOf(value.intValue()+1);
                recurrencyMap.put(clazz,Integer.valueOf(value));
            } else {
                recurrencyMap.put(clazz,Integer.valueOf(1));
            }
        }
    }

    public void removeFromRecurrencyMap(final Class clazz) {
        if (recurrencyMap != null) {
            if (recurrencyMap.containsKey(clazz)) {
                Integer value = recurrencyMap.get(clazz);
                value = Integer.valueOf(value.intValue() - 1);
                recurrencyMap.put(clazz, value);
            }
        }
    }

    public boolean isRecurencyLevelExceeded(final Class clazz){
        if(recurrencyMap!=null){
            final Integer value = recurrencyMap.get(clazz);
            if(value!=null){
                return (value.intValue()>recurrencyLevel);
            }
        }
        return false;
    }

    public void resetRecurrencyMap(){
        recurrencyMap = new HashMap<>();
    }

    public Map<String, Class> getTypeVariableMap() {
        return typeVariableMap;
    }

    public void setTypeVariableMap(final Map<String, Class> typeVariableMap) {
        this.typeVariableMap = typeVariableMap;
    }

    public int getRecurrencyLevel() {
        return recurrencyLevel;
    }

    public void setRecurrencyLevel(final int recurrencyLevel) {
        this.recurrencyLevel = recurrencyLevel;
    }

    public void resetFieldCounter() {
        fieldCounter = 0;
    }

    public void incrementFieldCounter() {
        fieldCounter++;
    }

    public boolean isMaxFieldSetSizeExceeded(){
        return fieldCounter > maxFieldSetSize;
    }

    public int getMaxFieldSetSize() {
        return maxFieldSetSize;
    }

    public void setMaxFieldSetSize(final int maxFieldSetSize) {
        this.maxFieldSetSize = maxFieldSetSize;
    }

    @Override
    public int hashCode() {
        int result = typeVariableMap!=null?typeVariableMap.hashCode():0;
        result = 31 * result + recurrencyLevel;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj==null || this.getClass()!=obj.getClass())return false;
        final FieldSetBuilderContext that = (FieldSetBuilderContext) obj;
        if(this.recurrencyLevel!=that.recurrencyLevel)return false;
        if(this.typeVariableMap!=null?!typeVariableMap.equals(that.typeVariableMap):that.typeVariableMap!=null){
            return false;
        }
        return true;
    }

}

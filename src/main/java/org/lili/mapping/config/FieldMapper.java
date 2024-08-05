package org.lili.mapping.config;

import ma.glasnost.orika.metadata.Type;

import java.util.List;
import java.util.Map;

/**
 * @packgeName: org.lili.mapping.config
 * @ClassName: FieldMapper
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/16-12:47
 * @version: 1.0
 * @since: JDK 1.8
 */
public class FieldMapper {

    private Class sourceClass;

    private Class destClass;

    private List<Class> sourceClassArguments;

    private List<Class> destClassArguments;

    private Map<String,String> fieldMapping;

    public Class getSourceClass() {
        return sourceClass;
    }

    public void setSourceClass(Class sourceClass) {
        this.sourceClass = sourceClass;
    }

    public Class getDestClass() {
        return destClass;
    }

    public void setDestClass(Class destClass) {
        this.destClass = destClass;
    }

    public List<Class> getSourceClassArguments() {
        return sourceClassArguments;
    }

    public void setSourceClassArguments(List<Class> sourceClassArguments) {
        this.sourceClassArguments = sourceClassArguments;
    }

    public List<Class> getDestClassArguments() {
        return destClassArguments;
    }

    public void setDestClassArguments(List<Class> destClassArguments) {
        this.destClassArguments = destClassArguments;
    }

    public Map<String, String> getFieldMapping() {
        return fieldMapping;
    }

    public void setFieldMapping(Map<String, String> fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    public Type[] getSourceActualTypeArguments(){
        if(this.sourceClassArguments!=null){
            final Type[] argument = this.sourceClassArguments.toArray(new Type[0]);
            return argument;
        }
        return null;
    }

    public Type[] getDestActualTypeArguments() {
        if (this.sourceClassArguments != null) {
            final Type[] arguments = this.destClassArguments.toArray(new Type[0]);
            return arguments;
        }
        return null;
    }
}

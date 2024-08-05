package org.lili.converters.impl;

import org.apache.commons.lang3.NotImplementedException;
import org.lili.converters.ConversionException;
import org.lili.converters.Converter;
import org.lili.converters.Populator;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;

/**
 * @packgeName: org.lili.converters
 * @ClassName: AbstractConvert
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-13:39
 * @version: 1.0
 * @since: JDK 1.8
 */
public abstract class AbstractConverter<SOURCE,TARGET> implements
        Converter<SOURCE,TARGET>,Populator<SOURCE,TARGET>,InitializingBean,BeanNameAware {

    private Class<TARGET> targetClass;


    //模板方法
    @Override
    public abstract void populate(SOURCE source, TARGET target);

    @Override
    public TARGET convert(SOURCE source) throws ConversionException {
        final TARGET target = (targetClass==null ? createTarget() : createFromClass());
        populate(source,target);
        return target;
    }

    private TARGET createFromClass() {
//        try {
//            return targetClass.newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
        try {
            return targetClass.newInstance();
        }catch (InstantiationException | IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * @deprecated Do not call this method - only call the single argument {@link #convert(Object)} method.
     * @param source
     * @param target
     * @return
     * @throws ConversionException
     */
    @Deprecated
    @Override
    public TARGET convert(SOURCE source, TARGET target) throws ConversionException {
        populate(source,target);
        return target;
    }

    public void setTargetClass(Class<TARGET> targetClass) {
        this.targetClass = targetClass;
        if(targetClass!=null){
            createFromClass();
        }
    }

    private String myBeanName;

    @Override
    public void setBeanName(String s) {
        this.myBeanName = myBeanName;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if(targetClass==null){
            final Class<? extends AbstractConverter> cl = this.getClass();
            final Method createTargetMethod = ReflectionUtils.findMethod(cl, "createTarget");
            if(AbstractConverter.class.equals(createTargetMethod.getDeclaringClass())){
                throw new IllegalStateException("Converter '" + myBeanName
                        + "' doesn't have a targetClass property nor does it override createTarget()!");
            }
        }
    }

    @Deprecated
    protected TARGET createTarget()
    {
        // optional - no longer requiring sub classes to implement this method
        throw new NotImplementedException("NotImplementedException");
    }
}

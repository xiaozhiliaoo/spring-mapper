package org.lili.converters;


import org.lili.util.ServicesUtil;
import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @packgeName: org.lili.converters
 * @ClassName: ConversionHelper
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-21:25
 * @version: 1.0
 * @since: JDK 1.8
 */
public final class ConversionHelper {

    static final Map<String,PropertyDescriptor[]> propertyDescriptorCache = new ConcurrentHashMap();

    //帮助类应该私有
    private ConversionHelper() {
        super();
    }


    public static <SOURCE, TARGET> void copyProperties(SOURCE source, TARGET target) {

        ServicesUtil.validateParameterNotNull(source,"source must not be null");
        ServicesUtil.validateParameterNotNull(target,"target must not be null");

        Class targetClass = target.getClass();
        //从缓存中获取PropertyDescriptor  属性描述符
        PropertyDescriptor[] targetPds = propertyDescriptorCache.get(targetClass.getName());
        if(targetPds == null){
            //PropertyDescriptor[]
            targetPds = BeanUtils.getPropertyDescriptors(targetClass);
            propertyDescriptorCache.put(targetClass.getName(),targetPds);
        }

        for (int i = 0; i < targetPds.length; i++) {

            PropertyDescriptor targetPd = targetPds[i];

            if(targetPd.getWriteMethod()!=null){
                //sourcePd to targetPd  A PropertyDescriptor describes one property that a Java Bean exports via a pair of accessor methods.
                PropertyDescriptor sourcePd = BeanUtils.getPropertyDescriptor(source.getClass(),targetPd.getName());
                //JAVABEAN
                if(sourcePd!=null && sourcePd.getReadMethod()!=null){
                    try {
                        //从source读，写入target    get
                        Method e = sourcePd.getReadMethod();
                        if(!Modifier.isPublic(e.getDeclaringClass().getModifiers())){
                            e.setAccessible(true);
                        }
                        //从source读到的值  getXXX
                        Object value = e.invoke(source, new Object[0]);
                        Method writeMethod = targetPd.getWriteMethod();
                        if(!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())){
                            writeMethod.setAccessible(true);
                        }
                        //传入参数  setXXX   set
                        Object[] args = new Object[]{value};

                        writeMethod.invoke(target,args);

                    } catch (IllegalAccessException e1) {
                        e1.printStackTrace();
                    } catch (InvocationTargetException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }

    public static <SRC,DEST,COLL extends Collection<DEST>> COLL
        convertAll(Collection<SRC> src,
                   Converter<SRC,DEST> converter,
                   COLL target) {
        Iterator var4 = src.iterator();
        while (var4.hasNext()){
            Object srcElem = (Object)var4.next();
            DEST destElem = converter.convert((SRC)srcElem);
            target.add(destElem);
        }
        return target;
    }
}

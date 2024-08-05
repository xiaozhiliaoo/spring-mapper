package org.lili.converters;

/**
 * @packgeName: org.lili.converters
 * @ClassName: GenericConverter
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-21:34
 * @version: 1.0
 * @since: JDK 1.8
 */

//单元测试快捷键   Ctrl + Shift + T
public class GenericConverter<SOURCE, TARGET> implements Converter<SOURCE, TARGET> {
    private Class<TARGET> destClass;

    public GenericConverter() {
    }

    public TARGET convert(SOURCE source) throws ConversionException {
        TARGET dest = this.createDestObject();
        return this.convert(source, dest);
    }

    public TARGET convert(SOURCE source, TARGET prototype) throws ConversionException {
        ConversionHelper.copyProperties(source, prototype);
        return prototype;
    }

    public void setDestClass(Class<TARGET> destClass) {
        this.destClass = destClass;
    }

    protected TARGET createDestObject() throws ConversionException {
        if(this.destClass == null) {
            throw new NullPointerException("No destClass set");
        } else {
            try {
                return this.destClass.newInstance();
            } catch (InstantiationException var2) {
                throw new ConversionException(var2.getMessage(), var2);
            } catch (IllegalAccessException var3) {
                throw new ConversionException(var3.getMessage(), var3);
            }
        }
    }

}

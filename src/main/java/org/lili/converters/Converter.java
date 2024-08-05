package org.lili.converters;

/**
 * @packgeName: org.lili.converters
 * @ClassName: Converter
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-21:19
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface Converter<SOURCE, TARGET> extends org.springframework.core.convert.converter.Converter<SOURCE,TARGET> {

    TARGET convert(SOURCE var1) throws ConversionException;

    TARGET convert(SOURCE var1, TARGET var2) throws ConversionException;

}

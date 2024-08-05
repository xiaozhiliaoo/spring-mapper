package org.lili.converters;

/**
 * @packgeName: org.lili.converters
 * @ClassName: Populator
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-13:27
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface Populator<SOURCE,TARGET> {

    void populate(SOURCE source, TARGET target) throws ConversionException;

}

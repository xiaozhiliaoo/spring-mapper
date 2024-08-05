package org.lili.converters.impl;

import org.lili.converters.ConversionException;
import org.lili.converters.Converter;
import org.lili.dto.businessdto.PriceData;
import org.lili.model.PriceInformationModel;

/**
 * @packgeName: org.lili.converters.impl
 * @ClassName: PriceInformationConverter
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-17:37
 * @version: 1.0
 * @since: JDK 1.8
 */
public class PriceInformationConverter implements Converter<PriceInformationModel, PriceData>
{

    public PriceData convert(final PriceInformationModel source) throws ConversionException
    {
        final PriceData data = new PriceData();
        return convert(source, data);
    }

    public PriceData convert(final PriceInformationModel source, final PriceData target)
    {
        target.setCurrency(source.getCurrency());
        target.setValue(source.getValue());
        return target;
    }
}

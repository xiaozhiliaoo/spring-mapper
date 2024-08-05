package org.lili.converters.impl;

import org.lili.converters.ConversionException;
import org.lili.converters.Converter;
import org.lili.dto.businessdto.ProductData;
import org.lili.model.ProductModel;

/**
 * @packgeName: org.lili.converters.impl
 * @ClassName: ProductConverter
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-17:35
 * @version: 1.0
 * @since: JDK 1.8
 */
public class ProductConverter implements Converter<ProductModel, ProductData> {

    @Override
    public ProductData convert(ProductModel source) throws ConversionException {
        final ProductData data = new ProductData();
        return convert(source, data);
    }

    @Override
    public ProductData convert(ProductModel source, ProductData target) throws ConversionException {
        target.setCode(source.getCode());
        target.setDescription(source.getDescription());
        target.setName(source.getName());
        target.setPictureUrl(source.getPictureUrl());
        return target;
    }

}

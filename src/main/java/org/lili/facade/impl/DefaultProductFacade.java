package org.lili.facade.impl;

import org.lili.converters.Converter;
import org.lili.dto.businessdto.PriceData;
import org.lili.dto.businessdto.ProductData;
import org.lili.facade.ProductFacade;
import org.lili.model.PriceInformationModel;
import org.lili.model.ProductModel;
import org.lili.service.PriceService;
import org.lili.service.ProductService;

import java.util.List;

/**
 * @packgeName: org.lili.facade.impl
 * @ClassName: DefaultProductFacade
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-16:40
 * @version: 1.0
 * @since: JDK 1.8
 */
public class DefaultProductFacade implements ProductFacade {


    private ProductService productService;
    private PriceService priceService;
    private Converter<ProductModel, ProductData> productConverter;
    private Converter<PriceInformationModel, PriceData> priceInformationConverter;

    public Converter<ProductModel, ProductData> getProductConverter() {
        return productConverter;
    }

    public void setProductConverter(Converter<ProductModel, ProductData> productConverter) {
        this.productConverter = productConverter;
    }

    public Converter<PriceInformationModel, PriceData> getPriceInformationConverter() {
        return priceInformationConverter;
    }

    public void setPriceInformationConverter(Converter<PriceInformationModel, PriceData> priceInformationConverter) {
        this.priceInformationConverter = priceInformationConverter;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public PriceService getPriceService() {
        return priceService;
    }

    public void setPriceService(PriceService priceService) {
        this.priceService = priceService;
    }



    @Override
    public ProductData getProduct(final String productCode) {
        //getProduct 方法充当了 Convertor的职责  但是如果其他方法和类也需要ProductModel转换成productData呢???
        //将Convert分离开来
        ProductModel product = productService.getProductForCode(productCode);
        List<PriceInformationModel> prices = priceService.getPriceInformationsForProduct(product);
        ProductData productData = new ProductData();
        productData.setCode(product.getCode());
        productData.setDescription(product.getDescription());
        productData.setName(product.getName());
        productData.setPictureUrl(product.getPictureUrl());

        if (!prices.isEmpty()) {
            PriceInformationModel price = prices.iterator().next();
            PriceData priceData = new PriceData();
            priceData.setCurrency(price.getCurrency());
            priceData.setValue(price.getValue());
            productData.setPrice(priceData);
        }
        return productData;
    }

    @Override
    public ProductData getProduct2(final String productCode) {
        final ProductModel product = productService.getProductForCode(productCode);
        final List<PriceInformationModel> prices = priceService.getPriceInformationsForProduct(product);
        final ProductData prodData = productConverter.convert(product);
        if (!prices.isEmpty()) {
            final PriceInformationModel price = prices.iterator().next();
            final PriceData priceData = priceInformationConverter.convert(price);
            prodData.setPrice(priceData);
        }
        return prodData;
    }

}

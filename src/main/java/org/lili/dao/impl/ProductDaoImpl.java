package org.lili.dao.impl;

import org.lili.dao.ProductDao;
import org.lili.model.ProductModel;

/**
 * @packgeName: org.lili.dao.impl
 * @ClassName: ProductDaoImpl
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-17:11
 * @version: 1.0
 * @since: JDK 1.8
 */
public class ProductDaoImpl implements ProductDao {


    @Override
    public ProductModel getProductForCode(String productCode) {
        ProductModel productModel = new ProductModel();
        productModel.setCode("IM1234567");
        productModel.setName("农夫山泉");
        productModel.setDescription("农夫山泉有点甜");
        productModel.setPictureUrl("http://www.nongfuspring.com/");
        return productModel;
    }
}

package org.lili.service.impl;

import org.lili.dao.ProductDao;
import org.lili.model.ProductModel;
import org.lili.service.ProductService;

import javax.annotation.Resource;

/**
 * @packgeName: org.lili.service.impl
 * @ClassName: ProductServiceImpl
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-16:59
 * @version: 1.0
 * @since: JDK 1.8
 */
public class ProductServiceImpl implements ProductService {

    @Resource(name = "productDao")
    private ProductDao productDao;

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public ProductModel getProductForCode(String productCode) {

        return productDao.getProductForCode(productCode);
    }
}

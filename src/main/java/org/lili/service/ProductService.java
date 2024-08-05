package org.lili.service;

import org.lili.model.ProductModel;

/**
 * @packgeName: org.lili.service
 * @ClassName: ProductService
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-16:44
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface ProductService {
    ProductModel getProductForCode(final String productCode);
}

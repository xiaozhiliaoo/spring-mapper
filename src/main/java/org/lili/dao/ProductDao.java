package org.lili.dao;

import org.lili.model.ProductModel;

/**
 * @packgeName: org.lili.dao
 * @ClassName: ProductDao
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-17:09
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface ProductDao {
    ProductModel getProductForCode(final String productCode);

}

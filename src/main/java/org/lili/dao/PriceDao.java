package org.lili.dao;

import org.lili.model.PriceInformationModel;
import org.lili.model.ProductModel;

import java.util.List;

/**
 * @packgeName: org.lili.dao
 * @ClassName: PriceDao
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-17:07
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface PriceDao {
    List<PriceInformationModel> getPriceInformationsForProduct(ProductModel product);
}

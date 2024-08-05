package org.lili.service;

import org.lili.model.PriceInformationModel;
import org.lili.model.ProductModel;

import java.util.List;

/**
 * @packgeName: org.lili.service
 * @ClassName: PriceService
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-16:44
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface PriceService {

    List<PriceInformationModel> getPriceInformationsForProduct(ProductModel product);
}

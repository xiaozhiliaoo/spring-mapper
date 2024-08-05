package org.lili.dao.impl;

import org.lili.dao.PriceDao;
import org.lili.model.PriceInformationModel;
import org.lili.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @packgeName: org.lili.dao.impl
 * @ClassName: PriceDaoImpl
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-17:07
 * @version: 1.0
 * @since: JDK 1.8
 */
public class PriceDaoImpl implements PriceDao {
    @Override
    public List<PriceInformationModel> getPriceInformationsForProduct(ProductModel product) {
        PriceInformationModel infoModel1 = new PriceInformationModel();
        infoModel1.setCurrency("RMB");
        infoModel1.setValue(1.5d);

        PriceInformationModel infoModel2 = new PriceInformationModel();
        infoModel2.setCurrency("USA");
        infoModel2.setValue(2d);

        List<PriceInformationModel> models = new ArrayList<>();
        models.add(infoModel1);
        models.add(infoModel2);
        return models;
    }
}

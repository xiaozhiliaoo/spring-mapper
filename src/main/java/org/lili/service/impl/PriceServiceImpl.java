package org.lili.service.impl;

import org.lili.dao.PriceDao;
import org.lili.model.PriceInformationModel;
import org.lili.model.ProductModel;
import org.lili.service.PriceService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @packgeName: org.lili.service.impl
 * @ClassName: PriceServiceImpl
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-16:59
 * @version: 1.0
 * @since: JDK 1.8
 */
public class PriceServiceImpl implements PriceService {

    @Resource(name = "priceDao")
    private PriceDao priceDao;

    public PriceDao getPriceDao() {
        return priceDao;
    }

    public void setPriceDao(PriceDao priceDao) {
        this.priceDao = priceDao;
    }

    @Override
    public List<PriceInformationModel> getPriceInformationsForProduct(ProductModel product) {
        return priceDao.getPriceInformationsForProduct(product);
    }
}

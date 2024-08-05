package org.lili.converters.populator;

import org.lili.converters.ConversionException;
import org.lili.converters.Populator;
import org.lili.dto.businessdto.OrderData;
import org.lili.model.OrderModel;

/**
 * @packgeName: org.lili.converters.populator
 * @ClassName: OrderPopulator2
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-17:25
 * @version: 1.0
 * @since: JDK 1.8
 */
public class OrderPopulator2<SOURCE extends OrderModel, TARGET extends OrderData> implements
        Populator<SOURCE, TARGET> {
    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        target.setOrderId(source.getOrderId());
        target.setOrderMessage(source.getOrderMessage());
        //target.setUser(source.getUser());
    }
}

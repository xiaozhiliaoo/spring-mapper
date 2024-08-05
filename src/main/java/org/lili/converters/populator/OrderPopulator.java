package org.lili.converters.populator;

import org.lili.converters.ConversionException;
import org.lili.dto.businessdto.OrderData;
import org.lili.model.OrderModel;

/**
 * @packgeName: org.lili.converters.populator
 * @ClassName: OrderPopulator
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-16:12
 * @version: 1.0
 * @since: JDK 1.8
 */
public class OrderPopulator<TARGET extends OrderData> extends AbstractOrderPopulator<OrderModel, TARGET> {

    @Override
    public void populate(OrderModel orderModel, TARGET target) throws ConversionException {
        target.setOrderId(orderModel.getOrderId());
    }
}

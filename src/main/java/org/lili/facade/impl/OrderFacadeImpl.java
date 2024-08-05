package org.lili.facade.impl;

import org.lili.converters.Converter;
import org.lili.dto.businessdto.AddOrderDataList;
import org.lili.dto.businessdto.OrderData;
import org.lili.facade.OrderFacade;
import org.lili.model.OrderModel;
import org.lili.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @packgeName: org.lili.facade.impl
 * @ClassName: OrderFacadeImpl
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-17:28
 * @version: 1.0
 * @since: JDK 1.8
 */
public class OrderFacadeImpl implements OrderFacade{

    @Resource(name = "orderService")
    private OrderService orderService;


    @Resource(name = "orderConverter")
    private Converter<OrderModel,OrderData> orderConverter;



    @Override
    public List<String> getOrderList(String orderId) {
        return orderService.getOrderList(orderId);
    }

    @Override
    public OrderData getOrder(AddOrderDataList addOrderDataList) {
        return null;
    }

    @Override
    public OrderData getOrder() {

        OrderModel orderModel = orderService.getOrder();
        OrderData orderData = orderConverter.convert(orderModel);
        //orderModel填充到orderData里面  Orika or  or Common BeanUtils
        return orderData;
//        return null;
    }
}

package org.lili.service.impl;

import org.lili.dao.OrderDao;
import org.lili.model.OrderModel;
import org.lili.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @packgeName: org.lili.service
 * @ClassName: OrderServiceImpl
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-17:29
 * @version: 1.0
 * @since: JDK 1.8
 */
public class OrderServiceImpl implements OrderService{

    @Resource(name = "orderDao")
    private OrderDao orderDao;

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public List<String> getOrderList(String orderId) {
        return orderDao.getOrderList(orderId);
    }


    @Override
    public OrderModel getOrder() {
        return orderDao.getOrder();
    }
}

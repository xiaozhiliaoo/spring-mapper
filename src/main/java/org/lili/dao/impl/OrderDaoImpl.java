package org.lili.dao.impl;

import org.lili.dao.OrderDao;
import org.lili.model.OrderModel;
import org.lili.model.UserModel;

import java.util.Arrays;
import java.util.List;

/**
 * @packgeName: org.lili.dao.impl
 * @ClassName: OrderDaoImpl
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-17:29
 * @version: 1.0
 * @since: JDK 1.8
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public List<String> getOrderList(String orderId) {
        return Arrays.asList(("order1 order2 order3 order4 order5 order6 order7 order8").split(" "));
    }

    @Override
    public OrderModel getOrder() {
        //Mock Data
        UserModel userModel = new UserModel();
        userModel.setId("1");
        userModel.setName("lili");
        userModel.setOrderId("00000001");
        OrderModel orderModel = new OrderModel();
        orderModel.setOrderId("00000001");
        orderModel.setOrderMessage("李先生买了一本Java编程思想");
        orderModel.setUser(userModel);
        return orderModel;
    }
}

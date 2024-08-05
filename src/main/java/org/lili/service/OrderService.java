package org.lili.service;

import org.lili.model.OrderModel;

import java.util.List;

/**
 * @packgeName: org.lili.service
 * @ClassName: OrderService
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-17:28
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface OrderService {
    List<String> getOrderList(String orderId);

    OrderModel getOrder();
}

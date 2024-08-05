package org.lili.dao;

import org.lili.model.OrderModel;

import java.util.List;

/**
 * @packgeName: org.lili.dao
 * @ClassName: OrderDao
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-17:29
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface OrderDao {
    List<String> getOrderList(String orderId);

    OrderModel getOrder();
}

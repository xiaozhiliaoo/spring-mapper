package org.lili.facade;

import org.lili.dto.businessdto.AddOrderDataList;
import org.lili.dto.businessdto.OrderData;

import java.util.List;

/**
 * @packgeName: org.lili.facade
 * @ClassName: OrderFacade
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-17:26
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface OrderFacade {
    List<String> getOrderList(String orderId);

    OrderData getOrder(AddOrderDataList addOrderDataList);

    OrderData getOrder();
}

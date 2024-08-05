package org.lili.dto.wsdto;

import org.lili.dto.businessdto.UserData;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: OrderWsDTO2
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-15:54
 * @version: 1.0
 * @since: JDK 1.8
 */
public class OrderWsDTO2 {
    private String orderId;
    private String orderMessage;
    private UserData user;

    public OrderWsDTO2() {

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage;
    }

    public UserData getUser() {
        return user;
    }

    public void setUser(UserData user) {
        this.user = user;
    }
}

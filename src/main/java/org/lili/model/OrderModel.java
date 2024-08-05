package org.lili.model;

/**
 * @packgeName: org.lili.model
 * @ClassName: OrderModel
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-20:20
 * @version: 1.0
 * @since: JDK 1.8
 */
public class OrderModel extends ItemModel{
    private String orderId;
    private String orderMessage;
    private UserModel user;

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

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }
}

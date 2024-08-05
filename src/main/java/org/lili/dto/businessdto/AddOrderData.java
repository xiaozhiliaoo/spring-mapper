package org.lili.dto.businessdto;

/**
 * @packgeName: org.lili.dto.businessdto
 * @ClassName: AddOrderData
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-20:34
 * @version: 1.0
 * @since: JDK 1.8
 */
public class AddOrderData {

    private String orderId;
    private String orderMessage;
    private UserData user;

    public AddOrderData() {

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

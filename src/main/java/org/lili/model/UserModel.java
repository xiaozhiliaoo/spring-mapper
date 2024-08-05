package org.lili.model;

/**
 * @packgeName: org.lili.model
 * @ClassName: UserModel
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-20:24
 * @version: 1.0
 * @since: JDK 1.8
 */
public class UserModel extends ItemModel{
    private String id;
    private String name;
    private String orderId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}

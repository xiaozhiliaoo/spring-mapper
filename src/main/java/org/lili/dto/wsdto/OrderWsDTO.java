package org.lili.dto.wsdto;

import org.lili.dto.businessdto.UserData;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: OrderWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-20:30
 * @version: 1.0
 * @since: JDK 1.8
 * 字段和OrderData不一样
 */
public class OrderWsDTO {

    private String id;
    private String message;
    private UserData client;

    public OrderWsDTO() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserData getClient() {
        return client;
    }

    public void setClient(UserData client) {
        this.client = client;
    }
}

package org.lili.dto.businessdto;

import java.io.Serializable;
import java.util.List;

/**
 * @packgeName: org.lili.dto.businessdto
 * @ClassName: AddOrderDataList
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-20:34
 * @version: 1.0
 * @since: JDK 1.8
 */
public class AddOrderDataList implements Serializable {

    private List<AddOrderData> entries;

    public AddOrderDataList() {
        //default constructor
    }

    public List<AddOrderData> getEntries() {
        return entries;
    }

    public void setEntries(List<AddOrderData> entries) {
        this.entries = entries;
    }
}

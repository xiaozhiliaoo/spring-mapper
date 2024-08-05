package org.lili.model;

/**
 * @packgeName: org.lili.model
 * @ClassName: StoreModel
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-11:25
 * @version: 1.0
 * @since: JDK 1.8
 */
public class StoreModel {
    private String id;
    private String name;
    private String location;

    public StoreModel() {
        super();
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

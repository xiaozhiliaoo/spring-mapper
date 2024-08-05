package org.lili.model;

import java.util.List;

/**
 * @packgeName: org.lili.model
 * @ClassName: EmployeeModel
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-11:22
 * @version: 1.0
 * @since: JDK 1.8
 */
public class EmployeeModel {
    private String uid;
    private String name;
    private String loginDisabled;
    private String lastLogin;
    private List<StoreModel> storeList;

    public EmployeeModel() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginDisabled() {
        return loginDisabled;
    }

    public void setLoginDisabled(String loginDisabled) {
        this.loginDisabled = loginDisabled;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public List<StoreModel> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<StoreModel> storeList) {
        this.storeList = storeList;
    }
}

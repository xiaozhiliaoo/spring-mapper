package org.lili.dao.impl;

import org.lili.dao.UserDao;
import org.lili.model.EmployeeModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @packgeName: org.lili.dao.impl
 * @ClassName: UserDaoImpl
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-12:55
 * @version: 1.0
 * @since: JDK 1.8
 */
public class UserDaoImpl implements UserDao {
    @Override
    public EmployeeModel getEmployee() {

        EmployeeModel e1 = new EmployeeModel();
        e1.setUid("1");
        e1.setName("lili");
        e1.setLastLogin("北京");
        e1.setLoginDisabled("false");
        return e1;
    }


    @Override
    public List<EmployeeModel> searchEmployeeList(String userId) {
        EmployeeModel e1 = new EmployeeModel();
        e1.setUid("1");
        e1.setName("lili");
        e1.setLastLogin("北京");
        e1.setLoginDisabled("false");

        EmployeeModel e2 = new EmployeeModel();
        e2.setUid("2");
        e2.setName("Rod Johnson");
        e2.setLastLogin("美国");
        e2.setLoginDisabled("true");

        EmployeeModel e3 = new EmployeeModel();
        e3.setUid("3");
        e3.setName("索罗斯");
        e3.setLastLogin("美国");
        e3.setLoginDisabled("true");

        List<EmployeeModel> modelList = new ArrayList<>();
        modelList.add(e1);
        modelList.add(e2);
        modelList.add(e3);
        modelList.add(e2);
        modelList.add(e3);
        return modelList;
    }
}

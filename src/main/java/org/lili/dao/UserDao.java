package org.lili.dao;

import org.lili.model.EmployeeModel;

import java.util.List;

/**
 * @packgeName: org.lili.dao
 * @ClassName: UserDao
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-12:55
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface UserDao {
    EmployeeModel getEmployee();

    List<EmployeeModel> searchEmployeeList(String userId);

}

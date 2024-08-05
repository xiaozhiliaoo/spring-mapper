package org.lili.service;

import org.lili.model.EmployeeModel;

import java.util.List;

/**
 * @packgeName: org.lili.service
 * @ClassName: UserService
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-12:50
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface UserService {
    EmployeeModel getEmployee();

    List<EmployeeModel> searchEmployeeList(String userId);
}

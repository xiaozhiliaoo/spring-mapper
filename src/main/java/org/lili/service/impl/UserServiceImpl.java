package org.lili.service.impl;

import org.lili.dao.UserDao;
import org.lili.model.EmployeeModel;
import org.lili.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @packgeName: org.lili.service.impl
 * @ClassName: UserServiceImpl
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-12:53
 * @version: 1.0
 * @since: JDK 1.8
 */
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public EmployeeModel getEmployee() {
        return userDao.getEmployee();
    }

    @Override
    public List<EmployeeModel> searchEmployeeList(String userId) {
        return userDao.searchEmployeeList(userId);
    }
}

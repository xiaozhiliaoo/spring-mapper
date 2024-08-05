package org.lili.facade.impl;

import org.lili.converters.impl.MKEmployeeConverter;
import org.lili.dto.businessdto.MKEmployeeData;
import org.lili.facade.UserFacade;
import org.lili.model.EmployeeModel;
import org.lili.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @packgeName: org.lili.facade.impl
 * @ClassName: UserFacedeImpl
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-12:45
 * @version: 1.0
 * @since: JDK 1.8
 */
public class UserFacedeImpl implements UserFacade {

    @Resource(name = "userService")
    private UserService userService;

    @Resource(name = "mkEmployeeConverter")
    private MKEmployeeConverter mkEmployeeConverter;

    @Override
    public MKEmployeeData getMKEmployeeData() {
        EmployeeModel employeeModel = userService.getEmployee();
        return mkEmployeeConverter.convert(employeeModel);
    }

    @Override
    public List<MKEmployeeData> getMKEmployeeDataList(String userId) {

        final List<EmployeeModel> employeeModels = this.userService.searchEmployeeList(userId);
        final List<MKEmployeeData> userDatas = new ArrayList<MKEmployeeData>();
        if(employeeModels == null || employeeModels.size() == 0){
            return new ArrayList<MKEmployeeData>();
        }

        for (final EmployeeModel employeeModel : employeeModels) {
            MKEmployeeData userData = new MKEmployeeData();
            userData =  mkEmployeeConverter.convert(employeeModel);
            userDatas.add(userData);
        }

        return userDatas;
    }
}

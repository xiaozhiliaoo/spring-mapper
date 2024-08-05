package org.lili.controller;

import org.lili.dto.businessdto.EmployeeDataList;
import org.lili.dto.businessdto.MKEmployeeData;
import org.lili.dto.wsdto.MKEmployeeListWsDTO;
import org.lili.dto.wsdto.MKEmployeeWsDTO;
import org.lili.facade.UserFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @packgeName: org.lili.controller
 * @ClassName: MKEmployeeController
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-11:33
 * @version: 1.0
 * @since: JDK 1.8
 */

@Controller
@RequestMapping("/employees/")
public class EmployeeController extends BaseController {


    @Resource(name = "userFacadeImpl")
    private UserFacade userFacade;

    //返回一个WSDTO
    @RequestMapping(value = "/getEmployee",
            method = RequestMethod.GET,
            headers = "Accept=application/json;charset=UTF-8")
    @ResponseBody
    public MKEmployeeWsDTO getUser(@RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) {
        //Convert你所需要的字段   dataMapper 别人所需要的字段
        final MKEmployeeData employeeData = userFacade.getMKEmployeeData();
        final MKEmployeeWsDTO employeeWsDTO = dataMapper.map(employeeData, MKEmployeeWsDTO.class, fields);
        return employeeWsDTO;
    }


    //返回一个WSDTOList  dataMapper不能从list-》list么？
    @RequestMapping(value = "/getEmployeeList",
            method = RequestMethod.GET,
            headers = "Accept=application/json;charset=UTF-8")
    @ResponseBody
    public MKEmployeeListWsDTO getmkUserList(
            @RequestParam(defaultValue = DEFAULT_FIELD_SET_FULL) final String fields,
            @RequestParam final String userId) {

        final List<MKEmployeeData> employeeDataList = userFacade.getMKEmployeeDataList(userId);
        EmployeeDataList empList = new EmployeeDataList();
        empList.setEmployees(employeeDataList);
        MKEmployeeListWsDTO dtolist = new MKEmployeeListWsDTO();
        List<MKEmployeeWsDTO> list = new ArrayList<MKEmployeeWsDTO>();
        for (MKEmployeeData employeeData : employeeDataList) {
            MKEmployeeWsDTO dto = dataMapper.map(employeeData, MKEmployeeWsDTO.class, fields);
            list.add(dto);
        }
        dtolist.setEmployeeList(list);
        return dtolist;
    }
}

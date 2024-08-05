package org.lili.controller;

import org.lili.dto.wsdto.UserWsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @packgeName: org.lili.controller
 * @ClassName: UserController
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:53
 * @version: 1.0
 * @since: JDK 1.8
 */

@Controller
@RequestMapping(value = "/users")
public class UsersController extends BaseController{



    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public UserWsDTO getUser(@RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields){

        return null;
    }


}

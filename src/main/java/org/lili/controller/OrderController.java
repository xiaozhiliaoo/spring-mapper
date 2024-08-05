package org.lili.controller;

import org.apache.log4j.Logger;
import org.lili.dto.businessdto.AddOrderDataList;
import org.lili.dto.businessdto.OrderData;
import org.lili.dto.wsdto.OrderWsDTO;
import org.lili.facade.OrderFacade;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @packgeName: org.lili.controller
 * @ClassName: OrderController
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-17:25
 * @version: 1.0
 * @since: JDK 1.8
 */

@Controller
@RequestMapping("/orders/")
public class OrderController extends BaseController{

//    @Autowired
//    private OrderFacade orderFacade;

    private static final Logger LOG = Logger.getLogger(OrderController.class);

    @Resource(name = "orderFacadeImpl")
    private OrderFacade orderFacade;

    //Test
    @RequestMapping(value= "/list")
    @ResponseBody
    private List<String> getOrderList(@RequestParam(value="orderId",defaultValue="0") String orderId) {

        //http://www.cnblogs.com/Hdaydayup/p/6853599.html

        try {
            LOG.info("accessing to orderController");
            List<String> list = orderFacade.getOrderList(orderId);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //创建订单  输入什么，输出什么，仅仅测试用
    @RequestMapping(value = "/createOrder",
            method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            headers = "Accept=application/json;charset=UTF-8")
    @ResponseBody
    private OrderWsDTO createOrder(
            @RequestParam(required = false)final AddOrderDataList addOrderDataList,
            @RequestParam(required = false,defaultValue = MKBASIC_FILED_SET) final String fields){

//        final OrderData orderData = orderFacade.getOrder(addOrderDataList);
//       return dataMapper.map(orderData,OrderWsDTO.class);
        return null;

    }



    @RequestMapping(value = "/getOrder", method = RequestMethod.GET,
            headers = "Accept=application/json;charset=UTF-8")
    @ResponseBody
    private OrderWsDTO getOrder(){
        //先做没有字段映射的，在做有字段映射得
       final OrderData orderData = orderFacade.getOrder();
       //字段一样
//       return dataMapper.map(orderData, OrderWsDTO2.class);
       return dataMapper.map(orderData,OrderWsDTO.class);
    }
}

package org.lili.controller;

import org.lili.dto.businessdto.ProductData;
import org.lili.facade.ProductFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @packgeName: org.lili.controller
 * @ClassName: ProductController
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-17:16
 * @version: 1.0
 * @since: JDK 1.8
 */


@Controller
@RequestMapping("/product/")
public class ProductController {

    @Resource(name = "productFacade")
    private ProductFacade productFacade;

    public ProductFacade getProductFacade() {
        return productFacade;
    }

    public void setProductFacade(ProductFacade productFacade) {
        this.productFacade = productFacade;
    }

    /*@Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String code = request.getParameter("code");
        ProductData product = null;
        if (code != null) {
            product = productFacade.getProduct(code);
        }

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("product", product);
        return new ModelAndView("product.jsp", model);
    }*/

    @RequestMapping(value = "/getProductData",
            method = RequestMethod.GET
    )
    @ResponseBody
    public ProductData getProductData(@RequestParam(required = true) final String productCode){
        try {
            ProductData productData = productFacade.getProduct2(productCode);
            return productData;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
}

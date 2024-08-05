package org.lili.facade;

import org.lili.dto.businessdto.ProductData;

/**
 * @packgeName: org.lili.facade
 * @ClassName: ProductFacade
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-16:39
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface ProductFacade {
    //manual 手工转换
    public ProductData getProduct(String productCode);
    // 使用Convertor转换
    public ProductData getProduct2(String productCode);

}

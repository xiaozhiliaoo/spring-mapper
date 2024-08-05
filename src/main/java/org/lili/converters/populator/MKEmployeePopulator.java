package org.lili.converters.populator;

import org.lili.converters.ConversionException;
import org.lili.converters.Populator;
import org.lili.dto.businessdto.MKEmployeeData;
import org.lili.dto.businessdto.SaleStoreData;
import org.lili.model.EmployeeModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @packgeName: org.lili.converters.populator
 * @ClassName: MKEmployeePopulator
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-12:37
 * @version: 1.0
 * @since: JDK 1.8
 */
public class MKEmployeePopulator implements Populator<EmployeeModel,MKEmployeeData> {


    @Override
    public void populate(EmployeeModel source, MKEmployeeData target) throws ConversionException {
        //在populate中填充自己所要的数据  不一定每一字段都需要    Model-》Data Object/Bussiness Object
        target.setUid(source.getUid());
        target.setName(source.getName());
        //假设这是通过uid查出来的SaleStoreData  Mock
        List<SaleStoreData> saleStoreModelList = new ArrayList<>();
        SaleStoreData s1 = new SaleStoreData();
        s1.setName("赵");
        s1.setBlockCdode("北京路200号");
        s1.setBrand("华为");
        s1.setCityCode("北京");
        s1.setDefaultPos("北京服务中心");
        s1.setPhone("13123456674");
        SaleStoreData s2 = new SaleStoreData();
        s2.setName("乾隆");
        s2.setBlockCdode("天津路200号");
        s2.setBrand("百度");
        s2.setCityCode("天津");
        s2.setDefaultPos("天津服务中心");
        s2.setPhone("18123450853");
        saleStoreModelList.add(s1);
        saleStoreModelList.add(s2);
        target.setStoreList(saleStoreModelList);
    }
}

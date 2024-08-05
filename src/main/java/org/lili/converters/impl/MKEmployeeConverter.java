package org.lili.converters.impl;

import org.lili.converters.ConversionException;
import org.lili.dto.businessdto.MKEmployeeData;
import org.lili.model.EmployeeModel;

/**
 * @packgeName: org.lili.converters.impl
 * @ClassName: MKEmployeeConverter
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-12:16
 * @version: 1.0
 * @since: JDK 1.8
 */
public class MKEmployeeConverter extends AbstractPopulatingConverter<EmployeeModel,MKEmployeeData> {

    @Override
    protected MKEmployeeData createTarget() {
        return new MKEmployeeData();
    }

    @Override
    public MKEmployeeData convert(EmployeeModel employeeModel) throws ConversionException {
        MKEmployeeData target = this.createTarget();
        populate(employeeModel,target);
        return target;
    }
}

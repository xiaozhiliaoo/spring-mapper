package org.lili.facade;

import org.lili.dto.businessdto.MKEmployeeData;

import java.util.List;

/**
 * @packgeName: org.lili.facade
 * @ClassName: UserFacede
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/22-11:44
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface UserFacade {

    MKEmployeeData getMKEmployeeData();

    List<MKEmployeeData> getMKEmployeeDataList(final String userId);
}

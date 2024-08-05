package org.lili.controller;

import org.apache.log4j.Logger;
import org.lili.mapping.DataMapper;
import org.lili.mapping.FieldSetLevelHelper;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @packgeName: org.lili.controller
 * @ClassName: BaseController
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:58
 * @version: 1.0
 * @since: JDK 1.8
 */

@Controller
public class BaseController {

    protected static final String DEFAULT_PAGE_SIZE = "20";
    protected static final String DEFAULT_CURRENT_PAGE = "0";
    protected static final String FULL_T_FILELD_SET= FieldSetLevelHelper.FULL_LEVEL;
    protected static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;
    protected static final String MKBASIC_FILED_SET = "MKBASIC";  //Mapping 是少量的字段
    protected static final String MKDEFALUT_FILED_SET = "MKDEFAULT";
    protected static final String MKFULL_FILED_SET = "MKFULL";
    protected static final String MKLIST_FILED_SET = "MKLIST" ;
    protected static final String MKVPPS_FILED_SET = "MKVPPS";
    protected static final String MKREHOME_FILED_SET = "MKREHOME";
    protected static final String HEADER_TOTAL_COUNT = "X-Total-Count";
    protected static final String DEFAULT_FIELD_SET_BASIC = FieldSetLevelHelper.BASIC_LEVEL;
    protected static final String DEFAULT_FIELD_SET_DEFAULT = FieldSetLevelHelper.DEFAULT_LEVEL;
    protected static final String DEFAULT_FIELD_SET_FULL = FieldSetLevelHelper.FULL_LEVEL;

    private static final Logger LOG = Logger.getLogger(BaseController.class);

    @Resource(name = "dataMapper")
    protected DataMapper dataMapper;

    public DataMapper getDataMapper() {
        return dataMapper;
    }

    public void setDataMapper(DataMapper dataMapper) {
        this.dataMapper = dataMapper;
    }
}

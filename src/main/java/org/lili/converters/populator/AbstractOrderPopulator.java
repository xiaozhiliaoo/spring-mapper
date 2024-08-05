package org.lili.converters.populator;

import org.lili.converters.Populator;
import org.lili.dto.businessdto.OrderData;
import org.lili.model.OrderModel;

/**
 * @packgeName: org.lili.converters.populator
 * @ClassName: AbstractOrderPopulator
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-16:16
 * @version: 1.0
 * @since: JDK 1.8
 */
public abstract class AbstractOrderPopulator<SOURCE extends OrderModel, TARGET extends OrderData>
        implements Populator<SOURCE, TARGET>{

}

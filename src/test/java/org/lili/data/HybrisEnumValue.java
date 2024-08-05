package org.lili.data;

import java.io.Serializable;

/**
 * @packgeName: org.lili.data
 * @ClassName: HybrisEnumValue
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/16-19:44
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface HybrisEnumValue extends Serializable {
    String getType();

    String getCode();
}


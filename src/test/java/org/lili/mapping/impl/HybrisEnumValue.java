package org.lili.mapping.impl;

import java.io.Serializable;

/**
 * @packgeName: org.lili.mapping.impl
 * @ClassName: HybrisEnumValue
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/16-19:43
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface HybrisEnumValue extends Serializable {
    String getType();

    String getCode();
}

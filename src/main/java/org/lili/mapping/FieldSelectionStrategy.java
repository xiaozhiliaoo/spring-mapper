package org.lili.mapping;

import ma.glasnost.orika.MappingContext;

/**
 * @packgeName: org.lili.mapping
 * @ClassName: FieldSelectionStrategy
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-19:20
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface FieldSelectionStrategy {
    boolean shouldMap(Object source, Object dest, MappingContext mappingContext);
}

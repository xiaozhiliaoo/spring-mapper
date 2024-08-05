package org.lili.mapping;

import org.lili.mapping.impl.FieldSetBuilderContext;

import java.util.Set;

/**
 * @packgeName: org.lili.mapping
 * @ClassName: FieldSetBuilder
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-19:25
 * @version: 1.0
 * @since: JDK 1.8
 */

public interface FieldSetBuilder {

    Set<String> createFieldSet(final Class clazz, final String fieldPrefix, final String configuration);

    Set<String> createFieldSet(final Class clazz, final String fieldPrefix,
                               final String configuration, FieldSetBuilderContext context);

}

package org.lili.mapping;

/**
 * @packgeName: org.lili.mapping
 * @ClassName: FieldSetBuilderHelper
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-19:30
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface FieldSetLevelHelper {

    String BASIC_LEVEL = "BASIC";
    String FULL_LEVEL = "FULL";
    String DEFAULT_LEVEL = "DEFAULT";

    boolean isLevelName(final String levelName, final Class objectClass);

    String createBasicLevelDefinition(final Class objectClass);

    String createFullLevelDefinition(Class objectClass);

    String createDefaultLevelDefinition(final Class objectClass);

    String getLevelDefinitionForClass(final Class objectClass, final String levelName);

}

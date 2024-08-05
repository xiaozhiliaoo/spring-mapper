package org.lili.mapping.config;

import java.util.*;

/**
 * @packgeName: org.lili.mapping.config
 * @ClassName: FieldSetLevelMapping
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/16-12:48
 * @version: 1.0
 * @since: JDK 1.8
 */
public class FieldSetLevelMapping {

    private Class dtoClass;
    private Map<String,String> levelMapping;

    public Class getDtoClass() {
        return dtoClass;
    }

    public void setDtoClass(Class dtoClass) {
        this.dtoClass = dtoClass;
    }

    public Map<String, String> getLevelMapping() {
        return levelMapping;
    }

    public void setLevelMapping(Map<String, String> levelMapping) {
        this.levelMapping = levelMapping;
    }
}

package org.lili.mapping.impl;

import ma.glasnost.orika.MappingContext;
import org.lili.mapping.DataMapper;
import org.lili.mapping.FieldSelectionStrategy;

import java.util.Set;

/**
 * @packgeName: org.lili.mapping.impl
 * @ClassName: DefaultFieldSelectionStrategy
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/16-12:48
 * @version: 1.0
 * @since: JDK 1.8
 */
public class DefaultFieldSelectionStrategy implements FieldSelectionStrategy{

    @Override
    public boolean shouldMap(Object source, Object dest, MappingContext mappingContext) {

        if(mappingContext.getProperty(DataMapper.MAP_NULLS)!=null){

            final Boolean mapNullsProperty = (Boolean) mappingContext.getProperty(DataMapper.MAP_NULLS);
            final boolean mapNulls = (mapNullsProperty == null ? false : mapNullsProperty.booleanValue());
            if(!mapNulls && source==null){
                return false;
            }
        }

        if (mappingContext.getProperty(DataMapper.FIELD_SET_NAME) != null) {

            final Set<String> config = (Set<String>) mappingContext.getProperty(DataMapper.FIELD_SET_NAME);
            if (config.contains(mappingContext.getFullyQualifiedDestinationPath())) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}

package org.lili.converters.impl;

import org.lili.converters.ConversionException;
import org.lili.converters.Populator;
import org.lili.converters.PopulatorList;

import java.util.List;

/**
 * @packgeName: org.lili.converters.impl
 * @ClassName: DefaultPopulatorList
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-13:30
 * @version: 1.0
 * @since: JDK 1.8
 */
public class DefaultPopulatorList<SOURCE, TARGET> implements Populator<SOURCE,TARGET>,
        PopulatorList<SOURCE,TARGET> {

    private List<Populator<SOURCE,TARGET>> populators;



    @Override
    public void populate(final SOURCE source,final TARGET target) throws ConversionException {
        final List<Populator<SOURCE,TARGET>> list = getPopulators();
        if (list!=null){
            for (Populator<SOURCE, TARGET> populator : list) {
                if(populator!=null){
                    populator.populate(source,target);
                }
            }
        }
    }

    @Override
    public List<Populator<SOURCE, TARGET>> getPopulators() {
        return populators;
    }

    @Override
    public void setPopulators(List<Populator<SOURCE, TARGET>> populators) {
        this.populators = populators;
    }
}

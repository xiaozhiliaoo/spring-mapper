package org.lili.converters;

import java.util.List;

/**
 * @packgeName: org.lili.converters
 * @ClassName: DefaultPopulatorList
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-15:26
 * @version: 1.0
 * @since: JDK 1.8
 */
public class DefaultPopulatorList<SOURCE,TARGET> implements Populator<SOURCE,TARGET>,
        PopulatorList<SOURCE,TARGET> {

    private List<Populator<SOURCE,TARGET>> populators;

    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        final List<Populator<SOURCE,TARGET>> populators = getPopulators();
        if(populators!=null){
            for (Populator<SOURCE, TARGET> populator : populators) {
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

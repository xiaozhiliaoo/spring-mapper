package org.lili.converters.impl;

import org.lili.converters.Populator;
import org.lili.converters.PopulatorList;

import java.util.List;

/**
 * @packgeName: org.lili.converters
 * @ClassName: AbstractPopulatingConverter
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-15:21
 * @version: 1.0
 * @since: JDK 1.8
 * 原本是抽象的，但是注入Bean报错，改为普通类，并且覆盖了createTarget方法
 */
public class AbstractPopulatingConverter<SOURCE,TARGET> extends AbstractConverter<SOURCE,TARGET>
        implements PopulatorList<SOURCE,TARGET> {

    private List<Populator<SOURCE,TARGET>>populators;

    @Override
    protected TARGET createTarget() {
        return super.createTarget();
    }

    @Override
    public List<Populator<SOURCE, TARGET>> getPopulators() {
        return populators;
    }

    @Override
    public void setPopulators(List<Populator<SOURCE, TARGET>> populators) {
        this.populators = populators;
    }

    @Override
    public void populate(SOURCE source, TARGET target) {
        final List<Populator<SOURCE,TARGET>>list = getPopulators();
        if(list!=null){
            for (Populator<SOURCE, TARGET> populator : list) {
                if(populator!=null){
                    populator.populate(source,target);
                }
            }
        }
    }
}

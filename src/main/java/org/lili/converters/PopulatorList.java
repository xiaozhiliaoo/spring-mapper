package org.lili.converters;

import java.util.List;

/**
 * @packgeName: org.lili.converters
 * @ClassName: PopulatorList
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-13:28
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface PopulatorList<SOURCE,TARGET> {

    //Why Setter and Getter in interface???
    List<Populator<SOURCE,TARGET>> getPopulators();

    void setPopulators(List<Populator<SOURCE, TARGET>> populators);
}

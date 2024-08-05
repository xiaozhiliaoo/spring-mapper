package org.lili.converters;

import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @packgeName: org.lili.converters
 * @ClassName: Converters
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-13:14
 * @version: 1.0
 * @since: JDK 1.8
 */
public final class Converters {

    //私有构造方法 防止其实例化
    private Converters() {
        super();
    }

    /**
     *
     * @param sourceList
     * @param converter
     * @param <SOURCE>
     * @param <TARGET>
     * @return
     */
    public static <SOURCE,TARGET> List<TARGET> convertAll(final Collection<? extends SOURCE> sourceList,
                        final Converter<SOURCE,TARGET> converter){

        //方法参数校验用声明和Precondition区别
        Assert.notNull(converter);

        if (sourceList == null || sourceList.isEmpty()) {
            return Collections.emptyList();
        }

        final List<TARGET> result = new ArrayList<TARGET>(sourceList.size());

        for (final SOURCE source : sourceList) {
            result.add(converter.convert(source));
        }

        return result;
    }

}

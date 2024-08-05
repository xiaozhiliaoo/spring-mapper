package org.lili.mapping;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.*;
import java.util.Set;

/**
 * @packgeName: org.lili.mapping
 * @ClassName: DataMapper
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-19:04
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface DataMapper {

    static final String FIELD_SET_NAME = "FIELD_SET_NAME";

    static final String MAP_NULLS = "MAP_NULLS";

    static final String FIELD_PREFIX = "destination";

    //Object -> Class

    <S,D> D map(S sourceObject, Class<D> destinationClass);

    <S,D> D map(S sourceObject, Class<D> destinationClass, String field);

    <S,D> D map(S sourceObject, Class<D> destinationClass, Set<String> fields);

    // Object -> Object
    <S, D> void map(S sourceObject, D destinationObject);

    <S, D> void map(S sourceObject, D destinationObject, boolean mapNulls);

    <S, D> void map(S sourceObject, D destinationObject, String fields);

    <S, D> void map(S sourceObject, D destinationObject, String fields, boolean mapNulls);

    <S, D> Set<D> mapAsSet(Iterable<S> source, Class<D> destinationClass, String fields);

    <S, D> List<D> mapAsList(Iterable<S> source, Class<D> destinationClass, String fields);

    <S, D> void mapAsCollection(Iterable<S> source, Collection<D> destination, Class<D> destinationClass, String fields);

    <S, D> void mapGeneric(final S sourceObject, final D destObject,
                           final Type[] sourceActualTypeArguments,
                           final Type[] destActualTypeArguments,
                           final String fileds,
                           final Map<String, Class> destTypeVariableMap);


}

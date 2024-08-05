package org.lili.mapping.impl;

import ma.glasnost.orika.*;
import ma.glasnost.orika.impl.ConfigurableMapper;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;
import ma.glasnost.orika.metadata.TypeFactory;
import org.lili.mapping.DataMapper;
import org.lili.mapping.FieldSetBuilder;
import org.lili.mapping.config.FieldMapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import ma.glasnost.orika.metadata.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @packgeName: org.lili.mapping.impl
 * @ClassName: DefaultDataMapper
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/16-12:48
 * @version: 1.0
 * @since: JDK 1.8
 */
//Orika和Spring集成
public class DefaultDataMapper extends ConfigurableMapper implements DataMapper,ApplicationContextAware{


    private static final boolean DEFAULT_MAP_NULLS = false;

    private final MappingContextFactory mappingContextFactory = new MappingContext.Factory();

    private MapperFactory factory;

    @Required
    public void setFieldSetBuilder(FieldSetBuilder fieldSetBuilder) {
        this.fieldSetBuilder = fieldSetBuilder;
    }

    private FieldSetBuilder fieldSetBuilder;

    private ApplicationContext applicationContext;

    public DefaultDataMapper(){
        super(false);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        init();
    }

    @Override
    protected void configureFactoryBuilder(DefaultMapperFactory.Builder factoryBuilder) {
        factoryBuilder.captureFieldContext(true);
    }

    @Override
    protected void configure(MapperFactory factory) {
        this.factory = factory;
        addAllSpringBeans();
    }

    protected void addAllSpringBeans() {

        final Map<String, Converter> converters =
                applicationContext.getBeansOfType(Converter.class);

        for (Converter converter : converters.values()) {
            addConvert(converter);
        }

        final Map<String, Mapper> mappers = applicationContext.getBeansOfType(Mapper.class);

        for (Mapper mapper : mappers.values()) {
            addMapper(mapper);
        }

        final Map<String, Filter> filters = applicationContext.getBeansOfType(Filter.class);

        for (Filter filter : filters.values()) {
            addFilter(filter);
        }

        final Map<String, FieldMapper> fieldMappers = applicationContext.getBeansOfType(FieldMapper.class);

        for (FieldMapper fieldMapper : fieldMappers.values()) {
            addFieldMapper(fieldMapper);
        }
    }

    private void addFieldMapper(FieldMapper fieldMapper) {
        ClassMapBuilder mapBuilder = null;
        if ((fieldMapper.getSourceClassArguments() != null && !fieldMapper.getSourceClassArguments().isEmpty())
                || (fieldMapper.getDestClassArguments() != null && !fieldMapper.getDestClassArguments().isEmpty())
                ) {
            final Type sourceType = TypeFactory.valueOf(fieldMapper.getSourceClass(),fieldMapper.getSourceActualTypeArguments());
            final Type destType = TypeFactory.valueOf(fieldMapper.getDestClass(),fieldMapper.getDestActualTypeArguments());
            mapBuilder = factory.classMap(sourceType, destType);
        }else{
            mapBuilder = factory.classMap(fieldMapper.getSourceClass(),fieldMapper.getDestClass());
        }
        if(fieldMapper.getFieldMapping()!=null && !fieldMapper.getFieldMapping().isEmpty()){
            for (Map.Entry<String, String> entry : fieldMapper.getFieldMapping().entrySet()) {
                mapBuilder.field(entry.getKey(),entry.getValue());
            }
        }
        factory.registerClassMap(mapBuilder.byDefault().toClassMap());
    }



    private void addFilter(Filter filter) {
        factory.registerFilter(filter);
    }

    private void addMapper(Mapper mapper) {
        factory.classMap(mapper.getAType(),mapper.getBType()).byDefault().customize((Mapper) mapper).register();
    }

    private void addConvert(Converter converter) {
        factory.getConverterFactory().registerConverter(converter);
    }


    @Override
    public <S, D> D map(S sourceObject, Class<D> destinationClass) {
        return super.map(sourceObject,destinationClass);
    }

    @Override
    public <S, D> D map(S sourceObject, Class<D> destinationClass, String fields) {
        return super.map(sourceObject, destinationClass, createMappingContext(destinationClass, fields));
    }

    @Override
    public <S, D> D map(S sourceObject, Class<D> destinationClass, Set<String> fields) {
        return super.map(sourceObject,destinationClass,createMappingContext(fields));
    }

    protected MappingContext createMappingContext(Set<String> fields) {
        final MappingContext context = mappingContextFactory.getContext();
        if (fields != null) {
            context.setProperty(FIELD_SET_NAME,fields);
        }
        return context;
    }

    @Override
    public <S, D> void map(S sourceObject, D destinationObject) {
        super.map(sourceObject, destinationObject);
    }

    @Override
    public <S, D> void map(S sourceObject, D destinationObject, boolean mapNulls) {
        super.map(sourceObject,destinationObject,createMappingContext(destinationObject.getClass(),null,mapNulls));
    }

    protected MappingContext createMappingContext(final Class  destinationClass, final String fields, boolean mapNulls) {
        final MappingContext context = mappingContextFactory.getContext();
        if (fields != null) {
            final Set<String> propertySet = fieldSetBuilder.createFieldSet(destinationClass,FIELD_PREFIX,fields);
            context.setProperty(FIELD_SET_NAME,propertySet);
        }
        context.setProperty(MAP_NULLS,Boolean.valueOf(mapNulls));
        return context;
    }

    @Override
    public <S, D> void map(S sourceObject, D destinationObject, String fields) {
        super.map(sourceObject,destinationObject,createMappingContext(destinationObject.getClass(),fields));
    }

    protected MappingContext createMappingContext(Class<?> destinationClass, String fields) {
        return createMappingContext(destinationClass, fields, DEFAULT_MAP_NULLS);
    }

    @Override
    public <S, D> void map(S sourceObject, D destinationObject, String fields, boolean mapNulls) {
        super.map(sourceObject,destinationObject,createMappingContext(destinationObject.getClass(),fields,mapNulls));
    }

    @Override
    public <S, D> Set<D> mapAsSet(Iterable<S> source, Class<D> destinationClass, String fields) {
        return super.mapAsSet(source,destinationClass,createMappingContext(destinationClass,fields));
    }

    @Override
    public <S, D> List<D> mapAsList(Iterable<S> source, Class<D> destinationClass, String fields) {
        return super.mapAsList(source,destinationClass,createMappingContext(destinationClass,fields));
    }

    @Override
    public <S, D> void mapAsCollection(Iterable<S> source, Collection<D> destination, Class<D> destinationClass, String fields) {
        mapAsCollection(source, destination, destinationClass, createMappingContext(destinationClass, fields));

    }

    @Override
    public <S, D> void mapGeneric(S sourceObject, D destObject,
                                  java.lang.reflect.Type[] sourceActualTypeArguments,
                                  java.lang.reflect.Type[] destActualTypeArguments,
                                  String fields, Map<String, Class> destTypeVariableMap) {

        final Type sourceType = TypeFactory.valueOf(sourceObject.getClass(), sourceActualTypeArguments);

        final Type destType = TypeFactory.valueOf(destObject.getClass(), destActualTypeArguments);

        map(sourceObject, destObject, sourceType, destType,
                createMappingContextForGeneric(destObject.getClass(), fields, destTypeVariableMap));
    }

    protected MappingContext createMappingContextForGeneric(final Class destinationClass, final String fields,
                                                            final Map<String, Class> typeVariableMap) {

        final MappingContext context = mappingContextFactory.getContext();
        if (fields != null) {
            final FieldSetBuilderContext fieldSetBuilderContext = new FieldSetBuilderContext();
            fieldSetBuilderContext.setTypeVariableMap(typeVariableMap);
            final Set<String> propertySet = fieldSetBuilder.createFieldSet(destinationClass, FIELD_PREFIX, fields,
                    fieldSetBuilderContext);
            context.setProperty(FIELD_SET_NAME, propertySet);
        }
        return context;
    }

}

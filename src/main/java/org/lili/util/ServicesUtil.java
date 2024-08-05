package org.lili.util;

import com.google.common.base.Preconditions;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collection;
import java.util.Iterator;

/**
 * @packgeName: org.lili.util
 * @ClassName: ServicesUtil
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-21:30
 * @version: 1.0
 * @since: JDK 1.8
 */
public class ServicesUtil {

    public ServicesUtil() {
    }

    public static void validateIfSingleResult(Collection<? extends Object> resultToCheck,
                                              String unknownIdException,
                                              String ambiguousIdException) {
        //检验参数  Preconditions
        Preconditions.checkArgument(resultToCheck != null,
                "the result collection can not be null");

        validateSingleResultWithType(resultToCheck,
                Object.class, unknownIdException,
                ambiguousIdException);
    }

    public static void validateIfSingleResult(Collection<? extends Object> resultToCheck,
                                              Class clazz, String qualifier,
                                              Object qualifierValue) {
        Preconditions.checkArgument(resultToCheck != null, "the result collection can not be null");
        Preconditions.checkArgument(clazz != null, "the given clazz can not be null");
        Preconditions.checkArgument(qualifier != null && qualifier.length() > 0, "qualifier must contain something");
        String unknownId = clazz.getSimpleName() + " with " + qualifier + " \'" + qualifierValue.toString() + "\' not found!";
        String ambiguousId = clazz.getSimpleName() + " " + qualifier + " \'" + qualifierValue.toString() + "\' is not unique, " + resultToCheck.size() + " instances  of type " + clazz.getSimpleName() + " found!";
        validateSingleResultWithType(resultToCheck, clazz, unknownId, ambiguousId);
    }



    private static void validateSingleResultWithType(Collection<? extends Object> resultToCheck,
                                                     Class clazz, String unknownIdException,
                                                     String ambiguousIdException) {
        if(CollectionUtils.isEmpty(resultToCheck)) {
            throw new UnknownIdentifierException(unknownIdException);
        } else if(resultToCheck.size() > 1) {
            throw new AmbiguousIdentifierException(ambiguousIdException);
        } else {
            Iterator var5 = resultToCheck.iterator();

            while(var5.hasNext()) {
                Object element = var5.next();
                if(!clazz.isInstance(element)) {
                    throw new IllegalStateException("element in result (\'" + element.getClass() + "\') is not the same class or a subclass of \'" + clazz + "\'");
                }
            }
        }
    }


    public static void validateIfAnyResult(Collection resultToCheck,
                                           String unknownIdException) {
        if(CollectionUtils.isEmpty(resultToCheck)) {
            throw new UnknownIdentifierException(unknownIdException);
        }
    }

    public static void validateParameterNotNull(Object parameter, String nullMessage) {
        Preconditions.checkArgument(parameter != null, nullMessage);
    }

    public static void validateParameterNotNullStandardMessage(String parameter, Object parameterValue) {
        validateParameterNotNull(parameterValue, "Parameter " + parameter + " can not be null");
    }
}


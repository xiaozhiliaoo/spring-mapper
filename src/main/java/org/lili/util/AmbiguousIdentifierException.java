package org.lili.util;

/**
 * @packgeName: org.lili.util
 * @ClassName: AmbiguousIdentifierException
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-11:38
 * @version: 1.0
 * @since: JDK 1.8
 */
public class AmbiguousIdentifierException extends SystemException {
    public AmbiguousIdentifierException(String message) {
        super(message);
    }

    public AmbiguousIdentifierException(Throwable cause) {
        super(cause);
    }

    public AmbiguousIdentifierException(String message, Throwable cause) {
        super(message, cause);
    }
}


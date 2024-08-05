package org.lili.util;

/**
 * @packgeName: org.lili.util
 * @ClassName: UnknownIdentifierException
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-11:38
 * @version: 1.0
 * @since: JDK 1.8
 */
public class UnknownIdentifierException extends SystemException {


    public UnknownIdentifierException(String message) {
        super(message);
    }

    public UnknownIdentifierException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownIdentifierException(Throwable cause) {
        super(cause);
    }
}

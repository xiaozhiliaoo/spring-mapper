package org.lili.util;

/**
 * @packgeName: org.lili.util
 * @ClassName: SystemException
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-11:39
 * @version: 1.0
 * @since: JDK 1.8
 */
public class SystemException extends RuntimeException {
    public SystemException(String message) {
        super(message);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }
}

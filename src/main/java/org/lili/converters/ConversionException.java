package org.lili.converters;

/**
 * @packgeName: org.lili.converters
 * @ClassName: ConvertionException
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-21:22
 * @version: 1.0
 * @since: JDK 1.8
 */
public class ConversionException  extends RuntimeException{

    public static final long serialVersionUID = -2280904009639576411L;

    public ConversionException() {
        super();
    }

    public ConversionException(String message) {
        super(message);
    }

    public ConversionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConversionException(Throwable cause) {
        super(cause);
    }

}

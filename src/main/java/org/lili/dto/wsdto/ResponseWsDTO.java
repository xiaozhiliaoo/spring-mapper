package org.lili.dto.wsdto;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: ResponseWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:40
 * @version: 1.0
 * @since: JDK 1.8
 */
public class ResponseWsDTO  implements java.io.Serializable {

    private String message;
    private String statusCode;

    public ResponseWsDTO() {
        // default constructor
    }


    public void setMessage(final String message)
    {
        this.message = message;
    }


    public String getMessage()
    {
        return message;
    }


    public void setStatusCode(final String statusCode)
    {
        this.statusCode = statusCode;
    }


    public String getStatusCode()
    {
        return statusCode;
    }


}

package org.lili.dto.wsdto;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: ErrorWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:41
 * @version: 1.0
 * @since: JDK 1.8
 */
public class ErrorWsDTO  implements java.io.Serializable
{

    private String reason;
    private String subject;
    private String type;
    private String message;
    private String subjectType;

    public ErrorWsDTO() {
        // default constructor
    }


    public void setReason(final String reason)
    {
        this.reason = reason;
    }


    public String getReason()
    {
        return reason;
    }


    public void setSubject(final String subject)
    {
        this.subject = subject;
    }


    public String getSubject()
    {
        return subject;
    }


    public void setType(final String type)
    {
        this.type = type;
    }


    public String getType()
    {
        return type;
    }


    public void setMessage(final String message)
    {
        this.message = message;
    }


    public String getMessage()
    {
        return message;
    }


    public void setSubjectType(final String subjectType)
    {
        this.subjectType = subjectType;
    }


    public String getSubjectType()
    {
        return subjectType;
    }


}

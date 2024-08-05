package org.lili.dto.wsdto;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: PrincipalWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:44
 * @version: 1.0
 * @since: JDK 1.8
 */
public class PrincipalWsDTO  implements java.io.Serializable {

    private String uid;
    private String name;

    public PrincipalWsDTO(){
        // default constructor
    }


    public void setUid(final String uid)
    {
        this.uid = uid;
    }


    public String getUid()
    {
        return uid;
    }


    public void setName(final String name)
    {
        this.name = name;
    }


    public String getName()
    {
        return name;
    }


}
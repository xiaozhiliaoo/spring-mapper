package org.lili.dto.wsdto;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: CityWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:49
 * @version: 1.0
 * @since: JDK 1.8
 */
public class CityWsDTO  implements java.io.Serializable
{

    /** <i>Generated property</i> for <code>CityWsDTO.sapCode</code> property defined at extension <code>markorpadwebservice</code>. */
    private String sapCode;
    /** <i>Generated property</i> for <code>CityWsDTO.code</code> property defined at extension <code>markorpadwebservice</code>. */
    private String code;
    /** <i>Generated property</i> for <code>CityWsDTO.name</code> property defined at extension <code>markorpadwebservice</code>. */
    private String name;

    public CityWsDTO()
    {
        // default constructor
    }


    public void setSapCode(final String sapCode)
    {
        this.sapCode = sapCode;
    }


    public String getSapCode()
    {
        return sapCode;
    }


    public void setCode(final String code)
    {
        this.code = code;
    }


    public String getCode()
    {
        return code;
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

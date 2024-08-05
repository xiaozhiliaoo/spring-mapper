package org.lili.dto.wsdto;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: DistrictWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:47
 * @version: 1.0
 * @since: JDK 1.8
 */
public class DistrictWsDTO  implements java.io.Serializable
{

    /** <i>Generated property</i> for <code>DistrictWsDTO.sapCode</code> property defined at extension <code>markorpadwebservice</code>. */
    private String sapCode;
    /** <i>Generated property</i> for <code>DistrictWsDTO.code</code> property defined at extension <code>markorpadwebservice</code>. */
    private String code;
    /** <i>Generated property</i> for <code>DistrictWsDTO.name</code> property defined at extension <code>markorpadwebservice</code>. */
    private String name;

    public DistrictWsDTO()
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

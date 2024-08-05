package org.lili.dto.wsdto;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: CountryWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:48
 * @version: 1.0
 * @since: JDK 1.8
 */
public class CountryWsDTO  implements java.io.Serializable
{

    /** <i>Generated property</i> for <code>CountryWsDTO.sapCode</code> property defined at extension <code>markorpadwebservice</code>. */
    private String sapCode;
    /** <i>Generated property</i> for <code>CountryWsDTO.isocode</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String isocode;
    /** <i>Generated property</i> for <code>CountryWsDTO.name</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String name;

    public CountryWsDTO()
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


    public void setIsocode(final String isocode)
    {
        this.isocode = isocode;
    }


    public String getIsocode()
    {
        return isocode;
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

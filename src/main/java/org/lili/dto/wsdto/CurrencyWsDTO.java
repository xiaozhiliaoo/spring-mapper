package org.lili.dto.wsdto;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: CurrencyWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:49
 * @version: 1.0
 * @since: JDK 1.8
 */
public class CurrencyWsDTO  implements java.io.Serializable
{

    /** <i>Generated property</i> for <code>CurrencyWsDTO.symbol</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String symbol;
    /** <i>Generated property</i> for <code>CurrencyWsDTO.isocode</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String isocode;
    /** <i>Generated property</i> for <code>CurrencyWsDTO.name</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String name;
    /** <i>Generated property</i> for <code>CurrencyWsDTO.active</code> property defined at extension <code>commercewebservicescommons</code>. */
    private Boolean active;

    public CurrencyWsDTO()
    {
        // default constructor
    }


    public void setSymbol(final String symbol)
    {
        this.symbol = symbol;
    }


    public String getSymbol()
    {
        return symbol;
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


    public void setActive(final Boolean active)
    {
        this.active = active;
    }


    public Boolean getActive()
    {
        return active;
    }


}

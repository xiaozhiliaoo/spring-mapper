package org.lili.dto.wsdto;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: LanguageWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:45
 * @version: 1.0
 * @since: JDK 1.8
 */
public class LanguageWsDTO  implements java.io.Serializable {

    private String nativeName;
    private String isocode;
    private String name;
    private Boolean active;

    public LanguageWsDTO() {
        // default constructor
    }


    public void setNativeName(final String nativeName)
    {
        this.nativeName = nativeName;
    }


    public String getNativeName()
    {
        return nativeName;
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

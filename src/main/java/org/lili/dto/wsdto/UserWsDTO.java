package org.lili.dto.wsdto;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: UserWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:44
 * @version: 1.0
 * @since: JDK 1.8
 */
public class UserWsDTO extends PrincipalWsDTO {

    /**
     * <i>Generated property</i> for <code>UserWsDTO.firstName</code> property defined at extension <code>commercewebservicescommons</code>.
     */
    private String firstName;
    /**
     * <i>Generated property</i> for <code>UserWsDTO.lastName</code> property defined at extension <code>commercewebservicescommons</code>.
     */
    private String lastName;
    /**
     * <i>Generated property</i> for <code>UserWsDTO.displayUid</code> property defined at extension <code>commercewebservicescommons</code>.
     */
    private String displayUid;
    /**
     * <i>Generated property</i> for <code>UserWsDTO.mobile</code> property defined at extension <code>markorpadwebservice</code>.
     */
    private String mobile;
    /**
     * <i>Generated property</i> for <code>UserWsDTO.currency</code> property defined at extension <code>commercewebservicescommons</code>.
     */
    private CurrencyWsDTO currency;
    /**
     * <i>Generated property</i> for <code>UserWsDTO.language</code> property defined at extension <code>commercewebservicescommons</code>.
     */
    private LanguageWsDTO language;
    /**
     * <i>Generated property</i> for <code>UserWsDTO.title</code> property defined at extension <code>commercewebservicescommons</code>.
     */
    private String title;
    /**
     * <i>Generated property</i> for <code>UserWsDTO.titleCode</code> property defined at extension <code>commercewebservicescommons</code>.
     */
    private String titleCode;
    /**
     * <i>Generated property</i> for <code>UserWsDTO.defaultAddress</code> property defined at extension <code>commercewebservicescommons</code>.
     */
    private AddressWsDTO defaultAddress;

    public UserWsDTO() {
        // default constructor
    }


    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setDisplayUid(final String displayUid) {
        this.displayUid = displayUid;
    }


    public String getDisplayUid() {
        return displayUid;
    }


    public void setMobile(final String mobile) {
        this.mobile = mobile;
    }


    public String getMobile() {
        return mobile;
    }


    public void setCurrency(final CurrencyWsDTO currency) {
        this.currency = currency;
    }


    public CurrencyWsDTO getCurrency() {
        return currency;
    }


    public void setLanguage(final LanguageWsDTO language) {
        this.language = language;
    }


    public LanguageWsDTO getLanguage() {
        return language;
    }


    public void setTitle(final String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }


    public void setTitleCode(final String titleCode) {
        this.titleCode = titleCode;
    }


    public String getTitleCode() {
        return titleCode;
    }


    public void setDefaultAddress(final AddressWsDTO defaultAddress) {
        this.defaultAddress = defaultAddress;
    }


    public AddressWsDTO getDefaultAddress() {
        return defaultAddress;
    }


}

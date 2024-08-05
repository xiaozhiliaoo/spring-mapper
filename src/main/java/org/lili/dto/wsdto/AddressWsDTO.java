package org.lili.dto.wsdto;

/**
 * @packgeName: org.lili.dto.wsdto
 * @ClassName: AddressWsDTO
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/14-18:45
 * @version: 1.0
 * @since: JDK 1.8
 */
public class AddressWsDTO  implements java.io.Serializable
{

    /** <i>Generated property</i> for <code>AddressWsDTO.mkbuildingData</code> property defined at extension <code>markorpadwebservice</code>. */
    private MkrBuildingWsDTO mkbuildingData;
    /** <i>Generated property</i> for <code>AddressWsDTO.lastName</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String lastName;
    /** <i>Generated property</i> for <code>AddressWsDTO.country</code> property defined at extension <code>commercewebservicescommons</code>. */
    private CountryWsDTO country;
    /** <i>Generated property</i> for <code>AddressWsDTO.townSapCode</code> property defined at extension <code>markorcustomer</code>. */
    private String townSapCode;
    /** <i>Generated property</i> for <code>AddressWsDTO.city</code> property defined at extension <code>markorpadwebservice</code>. */
    private CityWsDTO city;
    /** <i>Generated property</i> for <code>AddressWsDTO.companyName</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String companyName;
    /** <i>Generated property</i> for <code>AddressWsDTO.postalCode</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String postalCode;
    /** <i>Generated property</i> for <code>AddressWsDTO.title</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String title;
    /** <i>Generated property</i> for <code>AddressWsDTO.titleCode</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String titleCode;
    /** <i>Generated property</i> for <code>AddressWsDTO.addressId</code> property defined at extension <code>markorpadwebservice</code>. */
    private String addressId;
    /** <i>Generated property</i> for <code>AddressWsDTO.uid</code> property defined at extension <code>markorpadwebservice</code>. */
    private String uid;
    /** <i>Generated property</i> for <code>AddressWsDTO.streetName</code> property defined at extension <code>markorcustomer</code>. */
    private String streetName;
    /** <i>Generated property</i> for <code>AddressWsDTO.contactTitle</code> property defined at extension <code>markorcustomer</code>. */
    private String contactTitle;
    /** <i>Generated property</i> for <code>AddressWsDTO.formattedAddress</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String formattedAddress;
    /** <i>Generated property</i> for <code>AddressWsDTO.visibleInAddressBook</code> property defined at extension <code>commercewebservicescommons</code>. */
    private Boolean visibleInAddressBook;
    /** <i>Generated property</i> for <code>AddressWsDTO.orgAddressId</code> property defined at extension <code>markorpadwebservice</code>. */
    private String orgAddressId;
    /** <i>Generated property</i> for <code>AddressWsDTO.countrySapCode</code> property defined at extension <code>markorcustomer</code>. */
    private String countrySapCode;
    /** <i>Generated property</i> for <code>AddressWsDTO.id</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String id;
    /** <i>Generated property</i> for <code>AddressWsDTO.line2</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String line2;
    /** <i>Generated property</i> for <code>AddressWsDTO.line1</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String line1;
    /** <i>Generated property</i> for <code>AddressWsDTO.email</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String email;
    /** <i>Generated property</i> for <code>AddressWsDTO.contactMobile</code> property defined at extension <code>markorcustomer</code>. */
    private String contactMobile;
    /** <i>Generated property</i> for <code>AddressWsDTO.town</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String town;
    /** <i>Generated property</i> for <code>AddressWsDTO.streetNo</code> property defined at extension <code>markorcustomer</code>. */
    private String streetNo;
    /** <i>Generated property</i> for <code>AddressWsDTO.streetNumber</code> property defined at extension <code>markorpadwebservice</code>. */
    private String streetNumber;
    /** <i>Generated property</i> for <code>AddressWsDTO.contactName</code> property defined at extension <code>markorcustomer</code>. */
    private String contactName;
    /** <i>Generated property</i> for <code>AddressWsDTO.cityDistrict</code> property defined at extension <code>markorpadwebservice</code>. */
    private DistrictWsDTO cityDistrict;
    /** <i>Generated property</i> for <code>AddressWsDTO.regionSapCode</code> property defined at extension <code>markorcustomer</code>. */
    private String regionSapCode;
    /** <i>Generated property</i> for <code>AddressWsDTO.firstName</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String firstName;
    /** <i>Generated property</i> for <code>AddressWsDTO.citySapCode</code> property defined at extension <code>markorcustomer</code>. */
    private String citySapCode;
    /** <i>Generated property</i> for <code>AddressWsDTO.phone</code> property defined at extension <code>commercewebservicescommons</code>. */
    private String phone;
    /** <i>Generated property</i> for <code>AddressWsDTO.shippingAddress</code> property defined at extension <code>commercewebservicescommons</code>. */
    private Boolean shippingAddress;
    /** <i>Generated property</i> for <code>AddressWsDTO.region</code> property defined at extension <code>commercewebservicescommons</code>. */
    private RegionWsDTO region;
    /** <i>Generated property</i> for <code>AddressWsDTO.cellPhone</code> property defined at extension <code>markorpadwebservice</code>. */
    private String cellPhone;

    public AddressWsDTO()
    {
        // default constructor
    }


    public void setMkbuildingData(final MkrBuildingWsDTO mkbuildingData)
    {
        this.mkbuildingData = mkbuildingData;
    }


    public MkrBuildingWsDTO getMkbuildingData()
    {
        return mkbuildingData;
    }


    public void setLastName(final String lastName)
    {
        this.lastName = lastName;
    }


    public String getLastName()
    {
        return lastName;
    }


    public void setCountry(final CountryWsDTO country)
    {
        this.country = country;
    }


    public CountryWsDTO getCountry()
    {
        return country;
    }


    public void setTownSapCode(final String townSapCode)
    {
        this.townSapCode = townSapCode;
    }


    public String getTownSapCode()
    {
        return townSapCode;
    }


    public void setCity(final CityWsDTO city)
    {
        this.city = city;
    }


    public CityWsDTO getCity()
    {
        return city;
    }


    public void setCompanyName(final String companyName)
    {
        this.companyName = companyName;
    }


    public String getCompanyName()
    {
        return companyName;
    }


    public void setPostalCode(final String postalCode)
    {
        this.postalCode = postalCode;
    }


    public String getPostalCode()
    {
        return postalCode;
    }


    public void setTitle(final String title)
    {
        this.title = title;
    }


    public String getTitle()
    {
        return title;
    }


    public void setTitleCode(final String titleCode)
    {
        this.titleCode = titleCode;
    }


    public String getTitleCode()
    {
        return titleCode;
    }


    public void setAddressId(final String addressId)
    {
        this.addressId = addressId;
    }


    public String getAddressId()
    {
        return addressId;
    }


    public void setUid(final String uid)
    {
        this.uid = uid;
    }


    public String getUid()
    {
        return uid;
    }


    public void setStreetName(final String streetName)
    {
        this.streetName = streetName;
    }


    public String getStreetName()
    {
        return streetName;
    }


    public void setContactTitle(final String contactTitle)
    {
        this.contactTitle = contactTitle;
    }


    public String getContactTitle()
    {
        return contactTitle;
    }


    public void setFormattedAddress(final String formattedAddress)
    {
        this.formattedAddress = formattedAddress;
    }


    public String getFormattedAddress()
    {
        return formattedAddress;
    }


    public void setVisibleInAddressBook(final Boolean visibleInAddressBook)
    {
        this.visibleInAddressBook = visibleInAddressBook;
    }


    public Boolean getVisibleInAddressBook()
    {
        return visibleInAddressBook;
    }


    public void setOrgAddressId(final String orgAddressId)
    {
        this.orgAddressId = orgAddressId;
    }


    public String getOrgAddressId()
    {
        return orgAddressId;
    }


    public void setCountrySapCode(final String countrySapCode)
    {
        this.countrySapCode = countrySapCode;
    }


    public String getCountrySapCode()
    {
        return countrySapCode;
    }


    public void setId(final String id)
    {
        this.id = id;
    }


    public String getId()
    {
        return id;
    }


    public void setLine2(final String line2)
    {
        this.line2 = line2;
    }


    public String getLine2()
    {
        return line2;
    }


    public void setLine1(final String line1)
    {
        this.line1 = line1;
    }


    public String getLine1()
    {
        return line1;
    }


    public void setEmail(final String email)
    {
        this.email = email;
    }


    public String getEmail()
    {
        return email;
    }


    public void setContactMobile(final String contactMobile)
    {
        this.contactMobile = contactMobile;
    }


    public String getContactMobile()
    {
        return contactMobile;
    }


    public void setTown(final String town)
    {
        this.town = town;
    }


    public String getTown()
    {
        return town;
    }


    public void setStreetNo(final String streetNo)
    {
        this.streetNo = streetNo;
    }


    public String getStreetNo()
    {
        return streetNo;
    }


    public void setStreetNumber(final String streetNumber)
    {
        this.streetNumber = streetNumber;
    }


    public String getStreetNumber()
    {
        return streetNumber;
    }


    public void setContactName(final String contactName)
    {
        this.contactName = contactName;
    }


    public String getContactName()
    {
        return contactName;
    }


    public void setCityDistrict(final DistrictWsDTO cityDistrict)
    {
        this.cityDistrict = cityDistrict;
    }


    public DistrictWsDTO getCityDistrict()
    {
        return cityDistrict;
    }


    public void setRegionSapCode(final String regionSapCode)
    {
        this.regionSapCode = regionSapCode;
    }


    public String getRegionSapCode()
    {
        return regionSapCode;
    }


    public void setFirstName(final String firstName)
    {
        this.firstName = firstName;
    }


    public String getFirstName()
    {
        return firstName;
    }


    public void setCitySapCode(final String citySapCode)
    {
        this.citySapCode = citySapCode;
    }


    public String getCitySapCode()
    {
        return citySapCode;
    }


    public void setPhone(final String phone)
    {
        this.phone = phone;
    }


    public String getPhone()
    {
        return phone;
    }


    public void setShippingAddress(final Boolean shippingAddress)
    {
        this.shippingAddress = shippingAddress;
    }


    public Boolean getShippingAddress()
    {
        return shippingAddress;
    }


    public void setRegion(final RegionWsDTO region)
    {
        this.region = region;
    }


    public RegionWsDTO getRegion()
    {
        return region;
    }


    public void setCellPhone(final String cellPhone)
    {
        this.cellPhone = cellPhone;
    }


    public String getCellPhone()
    {
        return cellPhone;
    }


}

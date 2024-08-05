/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2017-8-16 17:53:20
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package org.lili.data;

import java.util.List;

public class RegionData  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>RegionData.sapCode</code> property defined at extension <code>markorcustomer</code>. */
	private String sapCode;
	/** <i>Generated property</i> for <code>RegionData.isocode</code> property defined at extension <code>commercefacades</code>. */
	private String isocode;
	/** <i>Generated property</i> for <code>RegionData.cities</code> property defined at extension <code>markorfacades</code>. */
	private List<CityData> cities;
	/** <i>Generated property</i> for <code>RegionData.countryIso</code> property defined at extension <code>commercefacades</code>. */
	private String countryIso;
	/** <i>Generated property</i> for <code>RegionData.name</code> property defined at extension <code>commercefacades</code>. */
	private String name;
	/** <i>Generated property</i> for <code>RegionData.isocodeShort</code> property defined at extension <code>commercefacades</code>. */
	private String isocodeShort;
		
	public RegionData()
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
		
		
	public void setCities(final List<CityData> cities)
	{
		this.cities = cities;
	}
	
		
	public List<CityData> getCities() 
	{
		return cities;
	}
		
		
	public void setCountryIso(final String countryIso)
	{
		this.countryIso = countryIso;
	}
	
		
	public String getCountryIso() 
	{
		return countryIso;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setIsocodeShort(final String isocodeShort)
	{
		this.isocodeShort = isocodeShort;
	}
	
		
	public String getIsocodeShort() 
	{
		return isocodeShort;
	}
		
	
}
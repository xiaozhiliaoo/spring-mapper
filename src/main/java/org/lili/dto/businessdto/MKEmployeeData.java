/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2017-8-21 10:32:45
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
package org.lili.dto.businessdto;

import java.util.List;

public class MKEmployeeData extends PrincipalData 
{

	/** <i>Generated property</i> for <code>MKEmployeeData.role</code> property defined at extension <code>markorfacades</code>. */
	private String role;
	/** <i>Generated property</i> for <code>MKEmployeeData.phone</code> property defined at extension <code>markorfacades</code>. */
	private String phone;
	/** <i>Generated property</i> for <code>MKEmployeeData.storeList</code> property defined at extension <code>markorfacades</code>. */
	private List<SaleStoreData> storeList;
		
	public MKEmployeeData()
	{
		// default constructor
	}
	
		
	public void setRole(final String role)
	{
		this.role = role;
	}
	
		
	public String getRole() 
	{
		return role;
	}
		
		
	public void setPhone(final String phone)
	{
		this.phone = phone;
	}
	
		
	public String getPhone() 
	{
		return phone;
	}
		
		
	public void setStoreList(final List<SaleStoreData> storeList)
	{
		this.storeList = storeList;
	}
	
		
	public List<SaleStoreData> getStoreList() 
	{
		return storeList;
	}
		
	
}
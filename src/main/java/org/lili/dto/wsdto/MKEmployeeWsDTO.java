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
package org.lili.dto.wsdto;

import java.util.List;

public class MKEmployeeWsDTO implements java.io.Serializable
{

	/** <i>Generated property</i> for <code>MKEmployeeWsDTO.role</code> property defined at extension <code>markorpadwebservice</code>. */
	private String role;
	/** <i>Generated property</i> for <code>MKEmployeeWsDTO.phone</code> property defined at extension <code>markorpadwebservice</code>. */
	private String phone;
	/** <i>Generated property</i> for <code>MKEmployeeWsDTO.storeList</code> property defined at extension <code>markorpadwebservice</code>. */
	private List<MKSaleStoreWsDTO> storeList;
	/** <i>Generated property</i> for <code>MKEmployeeWsDTO.userName</code> property defined at extension <code>markorpadwebservice</code>. */
	private String userName;
	/** <i>Generated property</i> for <code>MKEmployeeWsDTO.userId</code> property defined at extension <code>markorpadwebservice</code>. */
	private String userId;
		
	public MKEmployeeWsDTO()
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
		
		
	public void setStoreList(final List<MKSaleStoreWsDTO> storeList)
	{
		this.storeList = storeList;
	}
	
		
	public List<MKSaleStoreWsDTO> getStoreList() 
	{
		return storeList;
	}
		
		
	public void setUserName(final String userName)
	{
		this.userName = userName;
	}
	
		
	public String getUserName() 
	{
		return userName;
	}
		
		
	public void setUserId(final String userId)
	{
		this.userId = userId;
	}
	
		
	public String getUserId() 
	{
		return userId;
	}
		
	
}
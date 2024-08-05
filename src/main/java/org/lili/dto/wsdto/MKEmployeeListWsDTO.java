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

public class MKEmployeeListWsDTO implements java.io.Serializable
{

	/** <i>Generated property</i> for <code>MKEmployeeListWsDTO.employeeList</code> property defined at extension <code>markorpadwebservice</code>. */
	private List<MKEmployeeWsDTO> employeeList;
		
	public MKEmployeeListWsDTO()
	{
		// default constructor
	}
	
		
	public void setEmployeeList(final List<MKEmployeeWsDTO> employeeList)
	{
		this.employeeList = employeeList;
	}
	
		
	public List<MKEmployeeWsDTO> getEmployeeList() 
	{
		return employeeList;
	}
		
	
}
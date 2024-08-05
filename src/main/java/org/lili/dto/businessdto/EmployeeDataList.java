/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2017-8-21 10:32:46
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

public class EmployeeDataList implements java.io.Serializable
{

	/** <i>Generated property</i> for <code>EmployeeDataList.employees</code> property defined at extension <code>markorpadwebservice</code>. */
	private List<MKEmployeeData> employees;
		
	public EmployeeDataList()
	{
		// default constructor
	}
	
		
	public void setEmployees(final List<MKEmployeeData> employees)
	{
		this.employees = employees;
	}
	
		
	public List<MKEmployeeData> getEmployees() 
	{
		return employees;
	}
		
	
}
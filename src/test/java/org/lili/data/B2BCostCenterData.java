/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2017-8-16 17:53:23
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

public class B2BCostCenterData implements java.io.Serializable
{

	/** <i>Generated property</i> for <code>B2BCostCenterData.b2bBudgetData</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private List<B2BBudgetData> b2bBudgetData;
	/** <i>Generated property</i> for <code>B2BCostCenterData.unit</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private B2BUnitData unit;
	/** <i>Generated property</i> for <code>B2BCostCenterData.code</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private String code;
	/** <i>Generated property</i> for <code>B2BCostCenterData.name</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private String name;
	/** <i>Generated property</i> for <code>B2BCostCenterData.originalCode</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private String originalCode;
	/** <i>Generated property</i> for <code>B2BCostCenterData.active</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private boolean active;
	/** <i>Generated property</i> for <code>B2BCostCenterData.currency</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private CurrencyData currency;
	/** <i>Generated property</i> for <code>B2BCostCenterData.selected</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private boolean selected;
		
	public B2BCostCenterData()
	{
		// default constructor
	}
	
		
	public void setB2bBudgetData(final List<B2BBudgetData> b2bBudgetData)
	{
		this.b2bBudgetData = b2bBudgetData;
	}
	
		
	public List<B2BBudgetData> getB2bBudgetData() 
	{
		return b2bBudgetData;
	}
		
		
	public void setUnit(final B2BUnitData unit)
	{
		this.unit = unit;
	}
	
		
	public B2BUnitData getUnit() 
	{
		return unit;
	}
		
		
	public void setCode(final String code)
	{
		this.code = code;
	}
	
		
	public String getCode() 
	{
		return code;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
		
	public void setOriginalCode(final String originalCode)
	{
		this.originalCode = originalCode;
	}
	
		
	public String getOriginalCode() 
	{
		return originalCode;
	}
		
		
	public void setActive(final boolean active)
	{
		this.active = active;
	}
	
		
	public boolean isActive() 
	{
		return active;
	}
		
		
	public void setCurrency(final CurrencyData currency)
	{
		this.currency = currency;
	}
	
		
	public CurrencyData getCurrency() 
	{
		return currency;
	}
		
		
	public void setSelected(final boolean selected)
	{
		this.selected = selected;
	}
	
		
	public boolean isSelected() 
	{
		return selected;
	}
		
	
}
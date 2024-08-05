/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2017-8-16 17:53:24
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



public class B2BPermissionData implements java.io.Serializable
{

	/** <i>Generated property</i> for <code>B2BPermissionData.b2BPermissionTypeData</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private B2BPermissionTypeData b2BPermissionTypeData;
	/** <i>Generated property</i> for <code>B2BPermissionData.unit</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private B2BUnitData unit;
	/** <i>Generated property</i> for <code>B2BPermissionData.code</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private String code;
	/** <i>Generated property</i> for <code>B2BPermissionData.originalCode</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private String originalCode;
	/** <i>Generated property</i> for <code>B2BPermissionData.active</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private boolean active;
	/** <i>Generated property</i> for <code>B2BPermissionData.timeSpan</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private String timeSpan;
	/** <i>Generated property</i> for <code>B2BPermissionData.currency</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private CurrencyData currency;
	/** <i>Generated property</i> for <code>B2BPermissionData.periodRange</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private B2BPeriodRange periodRange;
	/** <i>Generated property</i> for <code>B2BPermissionData.value</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private Double value;
	/** <i>Generated property</i> for <code>B2BPermissionData.normalizedId</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private String normalizedId;
	/** <i>Generated property</i> for <code>B2BPermissionData.selected</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private boolean selected;
		
	public B2BPermissionData()
	{
		// default constructor
	}
	
		
	public void setB2BPermissionTypeData(final B2BPermissionTypeData b2BPermissionTypeData)
	{
		this.b2BPermissionTypeData = b2BPermissionTypeData;
	}
	
		
	public B2BPermissionTypeData getB2BPermissionTypeData() 
	{
		return b2BPermissionTypeData;
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
		
		
	public void setTimeSpan(final String timeSpan)
	{
		this.timeSpan = timeSpan;
	}
	
		
	public String getTimeSpan() 
	{
		return timeSpan;
	}
		
		
	public void setCurrency(final CurrencyData currency)
	{
		this.currency = currency;
	}
	
		
	public CurrencyData getCurrency() 
	{
		return currency;
	}
		
		
	public void setPeriodRange(final B2BPeriodRange periodRange)
	{
		this.periodRange = periodRange;
	}
	
		
	public B2BPeriodRange getPeriodRange() 
	{
		return periodRange;
	}
		
		
	public void setValue(final Double value)
	{
		this.value = value;
	}
	
		
	public Double getValue() 
	{
		return value;
	}
		
		
	public void setNormalizedId(final String normalizedId)
	{
		this.normalizedId = normalizedId;
	}
	
		
	public String getNormalizedId() 
	{
		return normalizedId;
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
/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2017-8-16 17:53:21
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

public class B2BUserGroupData extends UserGroupData 
{

	/** <i>Generated property</i> for <code>B2BUserGroupData.unit</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private B2BUnitData unit;
	/** <i>Generated property</i> for <code>B2BUserGroupData.permissions</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private List<B2BPermissionData> permissions;
	/** <i>Generated property</i> for <code>B2BUserGroupData.editable</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private boolean editable;
	/** <i>Generated property</i> for <code>B2BUserGroupData.roles</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private List<String> roles;
	/** <i>Generated property</i> for <code>B2BUserGroupData.selected</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private boolean selected;
	/** <i>Generated property</i> for <code>B2BUserGroupData.normalizedId</code> property defined at extension <code>b2bacceleratorfacades</code>. */
	private String normalizedId;
		
	public B2BUserGroupData()
	{
		// default constructor
	}
	
		
	public void setUnit(final B2BUnitData unit)
	{
		this.unit = unit;
	}
	
		
	public B2BUnitData getUnit() 
	{
		return unit;
	}
		
		
	public void setPermissions(final List<B2BPermissionData> permissions)
	{
		this.permissions = permissions;
	}
	
		
	public List<B2BPermissionData> getPermissions() 
	{
		return permissions;
	}
		
		
	public void setEditable(final boolean editable)
	{
		this.editable = editable;
	}
	
		
	public boolean isEditable() 
	{
		return editable;
	}
		
		
	public void setRoles(final List<String> roles)
	{
		this.roles = roles;
	}
	
		
	public List<String> getRoles() 
	{
		return roles;
	}
		
		
	public void setSelected(final boolean selected)
	{
		this.selected = selected;
	}
	
		
	public boolean isSelected() 
	{
		return selected;
	}
		
		
	public void setNormalizedId(final String normalizedId)
	{
		this.normalizedId = normalizedId;
	}
	
		
	public String getNormalizedId() 
	{
		return normalizedId;
	}
		
	
}
/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2017-8-16 17:53:22
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

public class UserGroupData extends PrincipalData 
{

	/** <i>Generated property</i> for <code>UserGroupData.membersCount</code> property defined at extension <code>commercefacades</code>. */
	private Integer membersCount;
	/** <i>Generated property</i> for <code>UserGroupData.members</code> property defined at extension <code>commercefacades</code>. */
	private List<? extends PrincipalData> members;
	/** <i>Generated property</i> for <code>UserGroupData.subGroups</code> property defined at extension <code>commercefacades</code>. */
	private List<? extends UserGroupData> subGroups;
		
	public UserGroupData()
	{
		// default constructor
	}
	
		
	public void setMembersCount(final Integer membersCount)
	{
		this.membersCount = membersCount;
	}
	
		
	public Integer getMembersCount() 
	{
		return membersCount;
	}
		
		
	public void setMembers(final List<? extends PrincipalData> members)
	{
		this.members = members;
	}
	
		
	public List<? extends PrincipalData> getMembers() 
	{
		return members;
	}
		
		
	public void setSubGroups(final List<? extends UserGroupData> subGroups)
	{
		this.subGroups = subGroups;
	}
	
		
	public List<? extends UserGroupData> getSubGroups() 
	{
		return subGroups;
	}
		
	
}
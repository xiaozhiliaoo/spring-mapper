/*
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package org.lili.data;

/**
 * Generated enum B2BPeriodRange declared at extension b2bcommerce.
 */
@SuppressWarnings("PMD")
public enum B2BPeriodRange implements HybrisEnumValue
{
	/**
	 * Generated enum value for B2BPeriodRange.DAY declared at extension b2bcommerce.
	 */
	DAY("DAY"),
	/**
	 * Generated enum value for B2BPeriodRange.WEEK declared at extension b2bcommerce.
	 */
	WEEK("WEEK"),
	/**
	 * Generated enum value for B2BPeriodRange.MONTH declared at extension b2bcommerce.
	 */
	MONTH("MONTH"),
	/**
	 * Generated enum value for B2BPeriodRange.QUARTER declared at extension b2bcommerce.
	 */
	QUARTER("QUARTER"),
	/**
	 * Generated enum value for B2BPeriodRange.YEAR declared at extension b2bcommerce.
	 */
	YEAR("YEAR");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "B2BPeriodRange";
	
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private B2BPeriodRange(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return getClass().getSimpleName();
	}
	
}

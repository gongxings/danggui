package com.danggui.common.redis;
/**
 * 
 * @author GongXings
 * @date 2018年7月8日
 */
public interface KeyPrefix {
		
	public int expireSeconds();
	
	public String getPrefix();
	
}

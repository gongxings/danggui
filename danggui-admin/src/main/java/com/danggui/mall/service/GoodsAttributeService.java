package com.danggui.mall.service;

import com.danggui.mall.entity.GoodsAttributeEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author GongXingSheng
 * 
 * @date 2017-08-13 10:41:08
 */
public interface GoodsAttributeService {
	
	GoodsAttributeEntity queryObject(Integer id);
	
	List<GoodsAttributeEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(GoodsAttributeEntity goodsAttribute);
	
	void update(GoodsAttributeEntity goodsAttribute);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

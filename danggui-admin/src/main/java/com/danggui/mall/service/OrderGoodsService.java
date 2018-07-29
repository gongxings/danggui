package com.danggui.mall.service;

import com.danggui.mall.entity.OrderGoodsEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author GongXingSheng
 * 
 * @date 2017-08-13 10:41:09
 */
public interface OrderGoodsService {
	
	OrderGoodsEntity queryObject(Integer id);
	
	List<OrderGoodsEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(OrderGoodsEntity orderGoods);
	
	void update(OrderGoodsEntity orderGoods);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

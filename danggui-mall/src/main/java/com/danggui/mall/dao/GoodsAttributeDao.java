package com.danggui.mall.dao;  
import com.danggui.common.dao.BaseDao;

import com.danggui.mall.entity.GoodsAttributeEntity;

/**
 * @author GongXingSheng
 * 
 * @date 2017-08-13 10:41:08
 */
public interface GoodsAttributeDao extends BaseDao<GoodsAttributeEntity> {

    int updateByGoodsIdAttributeId(GoodsAttributeEntity goodsAttributeEntity);
}

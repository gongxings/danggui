package com.danggui.mall.dao;  
import com.danggui.common.dao.BaseDao;

import com.danggui.mall.entity.GoodsGalleryEntity;

import java.util.Map;

/**
 * Dao
 *
 * @author GongXingSheng
 * 
 * @date 2017-08-23 14:41:43
 */
public interface GoodsGalleryDao extends BaseDao<GoodsGalleryEntity> {
    int deleteByGoodsId(Map<String, Integer> map);
}

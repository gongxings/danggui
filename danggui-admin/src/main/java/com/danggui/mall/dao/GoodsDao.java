package com.danggui.mall.dao;  
import com.danggui.common.dao.BaseDao;

import com.danggui.mall.entity.GoodsEntity;

/**
 * Dao
 *
 * @author GongXingSheng
 * 
 * @date 2017-08-21 21:19:49
 */
public interface GoodsDao extends BaseDao<GoodsEntity> {
    Integer queryMaxId();
}

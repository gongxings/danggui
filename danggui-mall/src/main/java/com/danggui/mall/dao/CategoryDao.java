package com.danggui.mall.dao;  
import com.danggui.common.dao.BaseDao;

import com.danggui.mall.entity.CategoryEntity;

/**
 * Dao
 *
 * @author GongXingSheng
 * 
 * @date 2017-08-21 15:32:31
 */
public interface CategoryDao extends BaseDao<CategoryEntity> {

    public int deleteByParentBatch(Object[] id);
}

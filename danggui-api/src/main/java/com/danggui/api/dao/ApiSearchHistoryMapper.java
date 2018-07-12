package com.danggui.api.dao;

import org.apache.ibatis.annotations.Param;

import com.danggui.api.entity.SearchHistoryVo;
import com.danggui.common.dao.BaseDao;

/**
 * 
 * @author GongXings
 * @date 2018年7月12日 下午11:03:53
 */
public interface ApiSearchHistoryMapper extends BaseDao<SearchHistoryVo> {
    int deleteByUserId(@Param("user_id") Long userId);
}

package com.danggui.api.dao;

import org.apache.ibatis.annotations.Param;

import com.danggui.api.entity.TokenEntity;
import com.danggui.common.dao.BaseDao;

/**
 * 用户Token
 * @author GongXings
 * @date 2018年7月12日 下午11:04:37
 */
public interface ApiTokenMapper extends BaseDao<TokenEntity> {

    TokenEntity queryByUserId(@Param("userId") Long userId);

    TokenEntity queryByToken(@Param("token") String token);

}

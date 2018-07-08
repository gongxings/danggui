package com.danggui.common.dao;

import org.apache.ibatis.annotations.Param;

import com.danggui.common.entity.SysConfigEntity;

/**
 * 系统配置信息
 * @author GongXings
 * @date 2018年7月8日
 */
public interface SysConfigDao extends BaseDao<SysConfigEntity> {

    /**
     * 根据key，查询value
     */
    String queryByKey(String paramKey);

    /**
     * 根据key，更新value
     *
     * @param key
     * @param value
     * @return
     */
    int updateValueByKey(@Param("key") String key, @Param("value") String value);

}

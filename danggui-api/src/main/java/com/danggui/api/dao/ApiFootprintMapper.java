package com.danggui.api.dao;

import java.util.List;
import java.util.Map;

import com.danggui.api.entity.FootprintVo;
import com.danggui.common.dao.BaseDao;

/**
 * 
 * @author GongXings
 * @date 2018年7月12日 下午10:59:26
 */
public interface ApiFootprintMapper extends BaseDao<FootprintVo> {
    int deleteByParam(Map<String, Object> map);

    List<FootprintVo> shareList(Map<String, Object> map);
}

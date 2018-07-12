package com.danggui.api.dao;

import java.util.List;
import java.util.Map;

import com.danggui.api.entity.GoodsVo;
import com.danggui.common.dao.BaseDao;

/**
 * 
 * @author GongXings
 * @date 2018年7月12日 下午11:00:20
 */
public interface ApiGoodsMapper extends BaseDao<GoodsVo> {

    List<GoodsVo> queryHotGoodsList(Map<String, Object> params);

    List<GoodsVo> queryCatalogProductList(Map<String, Object> params);
}

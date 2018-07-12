package com.danggui.api.dao;

import java.util.List;
import java.util.Map;

import com.danggui.api.entity.KeywordsVo;
import com.danggui.common.dao.BaseDao;

/**
 * 热闹关键词表
 * @author GongXings
 * @date 2018年7月12日 下午11:01:27
 */
public interface ApiKeywordsMapper extends BaseDao<KeywordsVo> {
    List<Map> hotKeywordList(Map param);
}

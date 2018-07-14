package com.danggui.api.dao;

import java.util.Map;

import com.danggui.api.entity.CommentVo;
import com.danggui.common.dao.BaseDao;

/**
 * @author GongXingSheng
 * 
 * @date 2017-08-11 09:14:26
 */
public interface ApiCommentMapper extends BaseDao<CommentVo> {
    int queryhasPicTotal(Map<String, Object> map);
}

package com.danggui.api.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danggui.api.dao.ApiRelatedGoodsMapper;
import com.danggui.api.entity.RelatedGoodsVo;


@Service
public class ApiRelatedGoodsService {
    @Autowired
    private ApiRelatedGoodsMapper relatedGoodsDao;


    public RelatedGoodsVo queryObject(Integer id) {
        return relatedGoodsDao.queryObject(id);
    }


    public List<RelatedGoodsVo> queryList(Map<String, Object> map) {
        return relatedGoodsDao.queryList(map);
    }


    public int queryTotal(Map<String, Object> map) {
        return relatedGoodsDao.queryTotal(map);
    }

    public int queryhasPicTotal(Map<String, Object> map) {
        return relatedGoodsDao.queryTotal(map);
    }

    public int save(RelatedGoodsVo comment) {
        return relatedGoodsDao.save(comment);
    }


    public void update(RelatedGoodsVo comment) {
        relatedGoodsDao.update(comment);
    }


    public void delete(Integer id) {
        relatedGoodsDao.delete(id);
    }


    public void deleteBatch(Integer[] ids) {
        relatedGoodsDao.deleteBatch(ids);
    }

}

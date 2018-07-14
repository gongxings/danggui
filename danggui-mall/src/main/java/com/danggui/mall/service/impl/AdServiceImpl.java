package com.danggui.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.danggui.mall.dao.AdDao;
import com.danggui.mall.entity.AdEntity;
import com.danggui.mall.service.AdService;

/**
 * Service实现类
 *
 * @author GongXingSheng
 * 
 * @date 2018年6月30日 09:37:35
 */
@Service("adService")
public class AdServiceImpl implements AdService {
    @Autowired
    private AdDao adDao;

    @Override
    public AdEntity queryObject(Integer id) {
        return adDao.queryObject(id);
    }

    @Override
    public List<AdEntity> queryList(Map<String, Object> map) {
        return adDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return adDao.queryTotal(map);
    }

    @Override
    public int save(AdEntity ad) {
        return adDao.save(ad);
    }

    @Override
    public int update(AdEntity ad) {
        return adDao.update(ad);
    }

    @Override
    public int delete(Integer id) {
        return adDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[]ids) {
        return adDao.deleteBatch(ids);
    }
}

package com.danggui.mall.service.impl;

import com.danggui.mall.dao.AttributeCategoryDao;
import com.danggui.mall.entity.AttributeCategoryEntity;
import com.danggui.mall.service.AttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author GongXingSheng
 * 
 * @date 2017-08-17 16:13:27
 */
@Service("attributeCategoryService")
public class AttributeCategoryServiceImpl implements AttributeCategoryService {
    @Autowired
    private AttributeCategoryDao attributeCategoryDao;

    @Override
    public AttributeCategoryEntity queryObject(Integer id) {
        return attributeCategoryDao.queryObject(id);
    }

    @Override
    public List<AttributeCategoryEntity> queryList(Map<String, Object> map) {
        return attributeCategoryDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return attributeCategoryDao.queryTotal(map);
    }

    @Override
    public int save(AttributeCategoryEntity attributeCategory) {
        return attributeCategoryDao.save(attributeCategory);
    }

    @Override
    public int update(AttributeCategoryEntity attributeCategory) {
        return attributeCategoryDao.update(attributeCategory);
    }

    @Override
    public int delete(Integer id) {
        return attributeCategoryDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return attributeCategoryDao.deleteBatch(ids);
    }
}

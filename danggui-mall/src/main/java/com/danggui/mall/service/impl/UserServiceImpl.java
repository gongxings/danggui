package com.danggui.mall.service.impl;

import com.danggui.mall.dao.UserDao;
import com.danggui.mall.entity.UserEntity;
import com.danggui.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author GongXingSheng
 * 
 * @date 2018年6月30日 15:02:28
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity queryObject(Integer id) {
        return userDao.queryObject(id);
    }

    @Override
    public List<UserEntity> queryList(Map<String, Object> map) {
        return userDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return userDao.queryTotal(map);
    }

    @Override
    public int save(UserEntity user) {
        user.setRegisterTime(new Date());
        return userDao.save(user);
    }

    @Override
    public int update(UserEntity user) {
        return userDao.update(user);
    }

    @Override
    public int delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return userDao.deleteBatch(ids);
    }
}

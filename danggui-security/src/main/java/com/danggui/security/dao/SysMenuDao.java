package com.danggui.security.dao;

import java.util.List;

import com.danggui.common.dao.BaseDao;
import com.danggui.security.entity.SysMenuEntity;

/**
 * 菜单管理
 * @author GongXings
 * @date 2018年7月10日 下午10:38:50
 */
public interface SysMenuDao extends BaseDao<SysMenuEntity> {

    /**
     * 根据父菜单，查询子菜单
     *
     * @param parentId 父菜单ID
     */
    List<SysMenuEntity> queryListParentId(Long parentId);

    /**
     * 获取不包含按钮的菜单列表
     */
    List<SysMenuEntity> queryNotButtonList();

    /**
     * 查询用户的权限列表
     */
    List<SysMenuEntity> queryUserList(Long userId);
}

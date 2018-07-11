package com.danggui.security.dao;

import java.util.List;

import com.danggui.common.dao.BaseDao;
import com.danggui.security.entity.SysRoleMenuEntity;

/**
 * 角色与菜单对应关系
 * @author GongXings
 * @date 2018年7月10日 下午10:40:01
 */
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity> {

    /**
     * 根据角色ID，获取菜单ID列表
     */
    List<Long> queryMenuIdList(Long roleId);
}

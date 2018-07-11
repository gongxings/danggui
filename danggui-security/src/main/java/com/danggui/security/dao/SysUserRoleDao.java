package com.danggui.security.dao;

import java.util.List;

import com.danggui.common.dao.BaseDao;
import com.danggui.security.entity.SysUserRoleEntity;

/**
 * 用户与角色对应关系
 * @author GongXings
 * @date 2018年7月10日 下午10:41:05
 */
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {

    /**
     * 根据用户ID，获取角色ID列表
     */
    List<Long> queryRoleIdList(Long userId);
}

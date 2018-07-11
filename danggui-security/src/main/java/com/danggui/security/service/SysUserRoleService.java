package com.danggui.security.service;

import java.util.List;


/**
 * 用户与角色对应关系
 * @author GongXings
 * @date 2018年7月10日 下午10:37:40
 */
public interface SysUserRoleService {

    void saveOrUpdate(Long userId, List<Long> roleIdList);

    /**
     * 根据用户ID，获取角色ID列表
     */
    List<Long> queryRoleIdList(Long userId);

    void delete(Long userId);
}

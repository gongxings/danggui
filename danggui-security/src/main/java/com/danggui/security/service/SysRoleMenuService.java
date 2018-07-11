package com.danggui.security.service;

import java.util.List;


/**
 * 角色与菜单对应关系
 * @author GongXings
 * @date 2018年7月10日 下午10:37:00
 */
public interface SysRoleMenuService {

    void saveOrUpdate(Long roleId, List<Long> menuIdList);

    /**
     * 根据角色ID，获取菜单ID列表
     */
    List<Long> queryMenuIdList(Long roleId);

}

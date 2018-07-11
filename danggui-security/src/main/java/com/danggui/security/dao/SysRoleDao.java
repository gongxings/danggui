package com.danggui.security.dao;

import java.util.List;

import com.danggui.common.dao.BaseDao;
import com.danggui.common.entity.UserWindowDto;
import com.danggui.security.entity.SysRoleEntity;

/**
 * 角色管理
 * @author GongXings
 * @date 2018年7月10日 下午10:39:11
 */
public interface SysRoleDao extends BaseDao<SysRoleEntity> {

    /**
     * 查询用户创建的角色ID列表
     */
    List<Long> queryRoleIdList(Long createUserId);

    /**
     * 查询角色审批选择范围
     * @return
     */
    List<UserWindowDto> queryPageByDto(UserWindowDto userWindowDto);
}

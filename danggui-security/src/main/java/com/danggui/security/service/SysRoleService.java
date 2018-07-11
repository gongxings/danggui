package com.danggui.security.service;

import java.util.List;
import java.util.Map;

import com.danggui.common.entity.UserWindowDto;
import com.danggui.common.page.Page;
import com.danggui.security.entity.SysRoleEntity;


/**
 * 角色
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2016年9月18日 上午9:42:52
 */
public interface SysRoleService {

    SysRoleEntity queryObject(Long roleId);

    List<SysRoleEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SysRoleEntity role);

    void update(SysRoleEntity role);

    void deleteBatch(Long[] roleIds);

    /**
     * 查询用户创建的角色ID列表
     */
    List<Long> queryRoleIdList(Long createUserId);

    /**
     * 分页查询角色审批选择范围
     * @return
     */
    Page<UserWindowDto> queryPageByDto(UserWindowDto userWindowDto, int pageNmu);
}

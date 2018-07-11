package com.danggui.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danggui.common.entity.UserWindowDto;
import com.danggui.common.page.Page;
import com.danggui.common.page.PageHelper;
import com.danggui.common.utils.Constant;
import com.danggui.common.utils.RRException;
import com.danggui.security.dao.SysRoleDao;
import com.danggui.security.entity.SysRoleEntity;
import com.danggui.security.service.SysRoleDeptService;
import com.danggui.security.service.SysRoleMenuService;
import com.danggui.security.service.SysRoleService;
import com.danggui.security.service.SysUserService;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 角色
 * @author GongXings
 * @date 2018年7月10日 下午10:43:05
 */
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleDao sysRoleDao;
    @Autowired
    private SysRoleMenuService sysRoleMenuService;
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleDeptService sysRoleDeptService;

    @Override
    public SysRoleEntity queryObject(Long roleId) {
        return sysRoleDao.queryObject(roleId);
    }

    @Override
    public List<SysRoleEntity> queryList(Map<String, Object> map) {
        return sysRoleDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysRoleDao.queryTotal(map);
    }

    @Override
    @Transactional
    public void save(SysRoleEntity role) {
        role.setCreateTime(new Date());
        sysRoleDao.save(role);

        //检查权限是否越权
        checkPrems(role);

        //保存角色与菜单关系
        sysRoleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIdList());

        //保存角色与部门关系
        sysRoleDeptService.saveOrUpdate(role.getRoleId(), role.getDeptIdList());
    }

    @Override
    @Transactional
    public void update(SysRoleEntity role) {
        sysRoleDao.update(role);

        //检查权限是否越权
        checkPrems(role);

        //更新角色与菜单关系
        sysRoleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIdList());
        //保存角色与部门关系
        sysRoleDeptService.saveOrUpdate(role.getRoleId(), role.getDeptIdList());
    }

    @Override
    @Transactional
    public void deleteBatch(Long[] roleIds) {
        sysRoleDao.deleteBatch(roleIds);
    }

    @Override
    public List<Long> queryRoleIdList(Long createUserId) {
        return sysRoleDao.queryRoleIdList(createUserId);
    }

    /**
     * 检查权限是否越权
     */
    private void checkPrems(SysRoleEntity role) {
        //如果不是超级管理员，则需要判断角色的权限是否超过自己的权限
        if (role.getCreateUserId() == Constant.SUPER_ADMIN) {
            return;
        }

        //查询用户所拥有的菜单列表
        List<Long> menuIdList = sysUserService.queryAllMenuId(role.getCreateUserId());

        //判断是否越权
        if (!menuIdList.containsAll(role.getMenuIdList())) {
            throw new RRException("新增角色的权限，已超出你的权限范围");
        }
    }

    @Override
    public Page<UserWindowDto> queryPageByDto(UserWindowDto userWindowDto, int pageNum) {
        PageHelper.startPage(pageNum, Constant.pageSize);
        sysRoleDao.queryPageByDto(userWindowDto);
        return PageHelper.endPage();
    }
}

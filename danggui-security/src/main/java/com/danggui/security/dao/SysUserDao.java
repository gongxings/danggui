package com.danggui.security.dao;

import java.util.List;
import java.util.Map;

import com.danggui.common.dao.BaseDao;
import com.danggui.common.entity.UserWindowDto;
import com.danggui.security.entity.SysUserEntity;

/**
 * 系统用户
 * @author GongXings
 * @date 2018年7月10日 下午10:40:24
 */
public interface SysUserDao extends BaseDao<SysUserEntity> {

    /**
     * 查询用户的所有权限
     *
     * @param userId 用户ID
     */
    List<String> queryAllPerms(Long userId);

    /**
     * 查询用户的所有菜单ID
     */
    List<Long> queryAllMenuId(Long userId);

    /**
     * 根据用户名，查询系统用户
     */
    SysUserEntity queryByUserName(String username);

    /**
     * 修改密码
     */
    int updatePassword(Map<String, Object> map);
    /**
     * 根据实体类查询
     * @param userWindowDto
     * @return
     */
    List<UserWindowDto> queryListByBean(UserWindowDto userWindowDto);
}

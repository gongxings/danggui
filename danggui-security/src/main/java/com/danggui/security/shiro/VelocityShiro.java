package com.danggui.security.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * Shiro权限标签(Velocity版)
 * @author GongXings
 * @date 2018年7月10日 下午10:46:10
 */
public class VelocityShiro {

    /**
     * 是否拥有该权限
     *
     * @param permission 权限标识
     * @return true：是     false：否
     */
    public boolean hasPermission(String permission) {
        Subject subject = SecurityUtils.getSubject();
        return subject != null && subject.isPermitted(permission);
    }

}

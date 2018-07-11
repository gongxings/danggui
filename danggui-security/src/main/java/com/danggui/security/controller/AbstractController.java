package com.danggui.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.danggui.security.entity.SysUserEntity;
import com.danggui.security.utils.ShiroUtils;

/**
 * Controller公共组件
 * @author GongXings
 * @date 2018年7月10日 下午10:46:56
 */
public abstract class AbstractController {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected SysUserEntity getUser() {
        return ShiroUtils.getUserEntity();
    }

    protected Long getUserId() {
        return getUser().getUserId();
    }

    protected Long getDeptId() {
        return getUser().getDeptId();
    }
}

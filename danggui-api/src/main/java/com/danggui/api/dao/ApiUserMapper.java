package com.danggui.api.dao;

import org.apache.ibatis.annotations.Param;

import com.danggui.api.entity.SmsLogVo;
import com.danggui.api.entity.UserVo;
import com.danggui.common.dao.BaseDao;

/**
 * 用户
 * @author GongXings
 * @date 2018年7月12日 下午11:06:30
 */
public interface ApiUserMapper extends BaseDao<UserVo> {

    UserVo queryByMobile(String mobile);

    UserVo queryByOpenId(@Param("openId") String openId);

    /**
     * 获取用户最后一条短信
     *
     * @param user_id
     * @return
     */
    SmsLogVo querySmsCodeByUserId(@Param("user_id") Long user_id);

    /**
     * 保存短信
     *
     * @param smsLogVo
     * @return
     */
    int saveSmsCodeLog(SmsLogVo smsLogVo);
}

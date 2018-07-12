package com.danggui.api.dao;

import org.apache.ibatis.annotations.Param;

import com.danggui.api.entity.UserCouponVo;
import com.danggui.common.dao.BaseDao;

/**
 * 
 * @author GongXings
 * @date 2018年7月12日 下午11:05:34
 */
public interface ApiUserCouponMapper extends BaseDao<UserCouponVo> {
    UserCouponVo queryByCouponNumber(@Param("coupon_number") String coupon_number);
}

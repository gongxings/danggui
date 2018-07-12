package com.danggui.api.dto;

/**
 * 
 * @author GongXings
 * @date 2018年7月12日 下午11:08:05
 */
public class CouponInfoVo {
    private String msg; // 显示信息
    private Integer type = 0; // 是否凑单 0否 1是

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
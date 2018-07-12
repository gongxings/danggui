package com.danggui.api.redis;

import com.danggui.common.redis.BasePrefix;

public class OrderKey extends BasePrefix {
    public OrderKey(String prefix) {
        super(prefix);
    }

    public OrderKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static OrderKey queryRepeatNum() {
        return new OrderKey("queryRepeatNum");
    }
}

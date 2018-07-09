package com.danggui.schedule.utils;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.ReflectionUtils;

import com.danggui.common.utils.RRException;
import com.danggui.common.utils.SpringContextUtils;

import java.lang.reflect.Method;

/**
 * 执行定时任务
 * @author GongXings
 * @date 2018年7月9日 下午9:22:35
 */
public class ScheduleRunnable implements Runnable {
    private Object target;
    private Method method;
    private String params;

    public ScheduleRunnable(String beanName, String methodName, String params) throws NoSuchMethodException, SecurityException {
        this.target = SpringContextUtils.getBean(beanName);
        this.params = params;

        if (StringUtils.isNotBlank(params)) {
            this.method = target.getClass().getDeclaredMethod(methodName, String.class);
        } else {
            this.method = target.getClass().getDeclaredMethod(methodName);
        }
    }

    @Override
    public void run() {
        try {
            ReflectionUtils.makeAccessible(method);
            if (StringUtils.isNotBlank(params)) {
                method.invoke(target, params);
            } else {
                method.invoke(target);
            }
        } catch (Exception e) {
            throw new RRException("执行定时任务失败", e);
        }
    }

}

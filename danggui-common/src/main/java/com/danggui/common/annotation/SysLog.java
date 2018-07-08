package com.danggui.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 * @author GongXings
 * @date 2018年7月8日
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "操作日志";
}

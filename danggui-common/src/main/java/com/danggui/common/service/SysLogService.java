package com.danggui.common.service;

import java.util.List;
import java.util.Map;

import com.danggui.common.entity.SysLogEntity;

/**
 * 系统日志
 * @author GongXings
 * @date 2018年7月8日
 */
public interface SysLogService {

    SysLogEntity queryObject(Long id);

    List<SysLogEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SysLogEntity sysLog);

    void update(SysLogEntity sysLog);

    void delete(Long id);

    void deleteBatch(Long[] ids);
}

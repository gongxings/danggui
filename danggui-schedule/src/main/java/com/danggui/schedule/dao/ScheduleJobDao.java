package com.danggui.schedule.dao;

import java.util.Map;

import com.danggui.common.dao.BaseDao;
import com.danggui.schedule.entity.ScheduleJobEntity;

/**
 * 定时任务
 * @author GongXings
 * @date 2018年7月9日
 */
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {

    /**
     * 批量更新状态
     */
    int updateBatch(Map<String, Object> map);
}

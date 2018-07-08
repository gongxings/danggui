package com.danggui.common.service;

import java.util.List;
import java.util.Map;

import com.danggui.common.entity.SysDeptEntity;
import com.danggui.common.entity.UserWindowDto;
import com.danggui.common.page.Page;

/**
 * 部门管理
 * @author GongXings
 * @date 2018年7月8日
 */
public interface SysDeptService {

    SysDeptEntity queryObject(Long deptId);

    List<SysDeptEntity> queryList(Map<String, Object> map);

    void save(SysDeptEntity sysDept);

    void update(SysDeptEntity sysDept);

    void delete(Long deptId);

    /**
     * 查询子部门ID列表
     *
     * @param parentId 上级部门ID
     */
    List<Long> queryDetpIdList(Long parentId);

    /**
     * 获取子部门ID(包含本部门ID)，用于数据过滤
     */
    String getSubDeptIdList(Long deptId);

    /**
     * 分页查询组织审批选择范围
     * @return
     */
    Page<UserWindowDto> queryPageByDto(UserWindowDto userWindowDto, int pageNum);
}

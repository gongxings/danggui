package com.danggui.common.dao;

import org.apache.ibatis.annotations.Mapper;

import com.danggui.common.entity.SysDeptEntity;
import com.danggui.common.entity.UserWindowDto;

import java.util.List;

/**
 * 部门管理
 * @author GongXings
 * @date 2018年7月8日
 */
@Mapper
public interface SysDeptDao extends BaseDao<SysDeptEntity> {

    /**
     * 查询子部门ID列表
     *
     * @param parentId 上级部门ID
     */
    List<Long> queryDetpIdList(Long parentId);


    /**
     * 根据实体条件查询
     *
     * @return
     */
    List<UserWindowDto> queryPageByDto(UserWindowDto userWindowDto);
}

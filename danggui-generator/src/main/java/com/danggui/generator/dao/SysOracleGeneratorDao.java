package com.danggui.generator.dao;


import java.util.List;
import java.util.Map;

import com.danggui.generator.entity.ResultMap;

/**
 * oracle代码生成器
 * @author GongXings
 * @date 2018年7月8日
 */
public interface SysOracleGeneratorDao {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<ResultMap> queryColumns(String tableName);
}

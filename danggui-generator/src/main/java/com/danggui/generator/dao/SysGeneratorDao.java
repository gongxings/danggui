package com.danggui.generator.dao;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器 dao
 * @author GongXings
 * @date 2018年7月8日
 */
public interface SysGeneratorDao {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);
}

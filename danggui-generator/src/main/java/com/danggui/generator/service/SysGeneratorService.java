package com.danggui.generator.service;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器service
 * @author GongXings
 * @date 2018年7月8日
 */
public interface SysGeneratorService {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);

    /**
     * 生成代码
     */
    byte[] generatorCode(String[] tableNames);
}

package com.somnus.practice.dao.dynamicSql;

import java.util.Map;

/**
 * @Author: zhangqiang
 * @Description:
 * @Date: Created in 19:10 2018/7/26
 * @Modified By:
 */
public class FilterKeywordSqlProvider {
    public String listFilterKeywordV3Sql(Map<String,Integer> sqlMap) {
      int category=sqlMap.get("category");
        String sql=String.format("SELECT id,category,word,weight FROM filter_keywords WHERE category=%d AND is_deleted=0",category);
        return sql;
    }
}

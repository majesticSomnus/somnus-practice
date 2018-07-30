package com.somnus.practice.dao;

import com.somnus.practice.bo.FilterKeywordBO;
import com.somnus.practice.dao.dynamicSql.FilterKeywordSqlProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhangqiang
 * @Description:
 * @Date: Created in 17:05 2018/7/26
 * @Modified By:
 */
@Repository
public interface FilterKeywordDao {
    @Select("SELECT id,category,word,weight FROM filter_keywords WHERE category=#{category} AND is_deleted=0")
    List<FilterKeywordBO> listFilterKeyword(@Param("category")int category);

    List<FilterKeywordBO> listFilterKeywordV2(@Param("category")int category);

    @SelectProvider(method = "listFilterKeywordV3Sql",type = FilterKeywordSqlProvider.class)
    List<FilterKeywordBO> listFilterKeywordV3(@Param("category")int category);
}

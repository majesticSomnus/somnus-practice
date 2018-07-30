package com.somnus.practice.service;

import com.somnus.practice.bo.FilterKeywordBO;
import com.somnus.practice.dao.FilterKeywordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: zhangqiang
 * @Description:
 * @Date: Created in 17:06 2018/7/26
 * @Modified By:
 */
@Component
public class FilterKeywordService {
    @Autowired
    private FilterKeywordDao keywordDao;

    public List<FilterKeywordBO> listFilterKeyword(int category) {
        return keywordDao.listFilterKeyword(category);
    }

    public List<FilterKeywordBO> listFilterKeywordV2(int category) {
        return keywordDao.listFilterKeywordV2(category);
    }

    public List<FilterKeywordBO> listFilterKeywordV3(int category) {
        return keywordDao.listFilterKeywordV3(category);
    }
}

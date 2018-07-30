package com.somnus.practice.service;

import com.somnus.practice.dao.HelloWorldDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhangqiang
 * @Description:
 * @Date: Created in 15:48 2018/7/26
 * @Modified By:
 */
@Component
public class HelloWorldService {
    @Autowired
   private HelloWorldDao dao;
    public void printHello(String name) {
        dao.printHello(name);
    }
}

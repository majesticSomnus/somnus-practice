package com.somnus.practice.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhangqiang
 * @Description:
 * @Date: Created in 15:47 2018/7/26
 * @Modified By:
 */
@Component
public class HelloWorldDao {
    public void printHello(String name) {
        System.out.println("Spring 3 : Hello ! " + name);
    }
}

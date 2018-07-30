package com.somnus.practice.controller;

import com.somnus.practice.bo.FilterKeywordBO;
import com.somnus.practice.service.FilterKeywordService;
import com.somnus.practice.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: zhangqiang
 * @Description:
 * @Date: Created in 17:29 2018/7/25
 * @Modified By:
 */
// 注解标注此类为springmvc的controller，url映射为"/home"
@Controller
@RequestMapping("/home")
public class HomeController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private FilterKeywordService keywordService;

    //映射一个action
    @RequestMapping("/index")
    public  String index(){
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        helloWorldService.printHello("somnus");
        return "index";
    }

    @RequestMapping("/list")
    public  String listFilterKeyword(){
        List<FilterKeywordBO> keywordList = keywordService.listFilterKeyword(3);
        System.out.println("keywordList size="+keywordList.size());
        return "index";
    }

    @RequestMapping("/list2")
    public  String listFilterKeywordV2(){
        List<FilterKeywordBO> keywordList = keywordService.listFilterKeywordV2(0);
        System.out.println("keywordListV2  size="+keywordList.size());
        return "index";
    }

    @RequestMapping("/list3")
    public  String listFilterKeywordV3(){
        List<FilterKeywordBO> keywordList = keywordService.listFilterKeywordV3(3);
        System.out.println("keywordListV2  size="+keywordList.size());
        return "index";
    }
}

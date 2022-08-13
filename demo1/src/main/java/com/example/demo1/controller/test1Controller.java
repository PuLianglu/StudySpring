package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demotest
 * @description: test2
 * @author: puLiangLu
 * @create: 2022-08-06 20:58
 **/
@RestController
public class test1Controller {

    @RequestMapping("/test2")
    public String test2(){
        System.out.println("这是test2服务");
        return "这是test2服务";
    }
}

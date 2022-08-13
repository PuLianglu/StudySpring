package com.example.demo2.controller;

import com.example.demo2.bean.UserBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: demotest
 * @description: user接口
 * @author: puLiangLu
 * @create: 2022-08-13 14:46
 **/
@RestController
public class userconotroller {

    @Resource
    private UserBean userBean;


    @RequestMapping("/test")
    public String test(){
        System.out.println(userBean);
        return "hello";
    }
}

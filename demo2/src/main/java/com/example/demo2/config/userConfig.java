package com.example.demo2.config;

import com.example.demo2.bean.UserBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: demotest
 * @description: User配置
 * @author: puLiangLu
 * @create: 2022-08-13 14:20
 **/
//@Configuration
public class userConfig {
    @Value("${user.i}")
    private int i;
    @Value("${user.name1}")
    private String name;

    @Bean
    public UserBean user() {
        return new UserBean(i,name);
    }

}

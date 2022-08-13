package com.example.demo2.config;

import org.apache.catalina.startup.UserConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @program: demotest
 * @description:
 * @author: puLiangLu
 * @create: 2022-08-13 14:26
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(userConfig.class)
public @interface EableUser {
}

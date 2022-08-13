package com.example.demo2;

import com.example.demo2.bean.UserBean;
import com.example.demo2.config.EableUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EableUser
public class Demo2Application {

    public static void main(String[] args) {

        // SpringApplication.run(Demo2Application.class, args);

        ConfigurableApplicationContext context = SpringApplication.run(Demo2Application.class, args);
        UserBean userBean = (UserBean) context.getBean("user");
        System.out.println(userBean);
    }

}

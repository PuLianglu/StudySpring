package com.example.demo2.bean;

/**
 * @program: demotest
 * @description: 用户
 * @author: puLiangLu
 * @create: 2022-08-13 12:13
 **/
public class UserBean {

    private int id;

    private String name;

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public UserBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

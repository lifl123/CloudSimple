package com.zw.entity;

/**
 * Created by Administrator on 2017/5/14.
 */
public class User {
    private int id;
    private String user_name;
    private String password;
    private int age;
    private int roid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoid() {
        return roid;
    }

    public void setRoid(int roid) {
        this.roid = roid;
    }
}

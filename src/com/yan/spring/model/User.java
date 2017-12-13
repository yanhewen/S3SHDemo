package com.yan.spring.model;

/**
 * Created by yan-hewen@163.com on 2017/12/13.<br>
 */

public class User {
    private String username;
    private Integer age;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void sayHello(){
        System.out.println("Hi,Kiki!");
    }
}

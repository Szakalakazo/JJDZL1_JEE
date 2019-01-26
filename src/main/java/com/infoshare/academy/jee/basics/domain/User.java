package com.infoshare.academy.jee.basics.domain;


import lombok.Getter;

@Getter
public class User {
    private int id;
    private int age;
    private String name;
    private String login;
    private String password;


    public User(int id, String name, String login, String password,int age) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.login = login;
        this.password = password;
    }
}

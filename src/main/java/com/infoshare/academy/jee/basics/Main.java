package com.infoshare.academy.jee.basics;

import com.infoshare.academy.jee.basics.dao.UsersRepositoryDao;
import com.infoshare.academy.jee.basics.dao.UsersRepositoryDaoBean;
import com.infoshare.academy.jee.basics.domain.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UsersRepositoryDao dao = new UsersRepositoryDaoBean();
        List<User> userList = dao.getUsersList();

        for (User user : userList) {
            System.out.println(user.getName());
        }





    }
}
package com.infoshare.academy.jee.basics.dao;

import com.infoshare.academy.jee.basics.domain.User;

import java.util.List;

public interface UsersRepositoryDao {

    void addUser(User user);

    User getUserById(int id);

    User getUserByLogin(String login);

    List<User> getUsersList();
}

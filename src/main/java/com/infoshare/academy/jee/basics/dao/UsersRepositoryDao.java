package com.infoshare.academy.jee.basics.dao;

import com.infoshare.academy.jee.basics.domain.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UsersRepositoryDao {

    void addUser(User user);

    User getUserById(int id);

    User getUserByLogin(String login);

    List<User> getUsersList();
}

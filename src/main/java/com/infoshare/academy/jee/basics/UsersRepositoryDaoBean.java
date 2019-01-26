package com.infoshare.academy.jee.basics;

import com.infoshare.academy.jee.basics.dao.UsersRepositoryDao;
import com.infoshare.academy.jee.basics.domain.User;

import java.util.List;

public class UsersRepositoryDaoBean implements UsersRepositoryDao {


    @Override
    public void addUser(User user) {
        List<User> users = UsersRepository.getUsers();
        users.add(user);
    }

    @Override
    public User getUserById(int id) {
        List<User> users = UsersRepository.getUsers();
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        throw new IllegalArgumentException("Unexpected user ID" + id);
    }

    @Override
    public User getUserByLogin(String login) {
        List<User> users = UsersRepository.getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        throw new IllegalArgumentException("Unexpected user login" + login);
    }

    @Override
    public List<User> getUsersList() {
        return UsersRepository.getUsers();
    }
}

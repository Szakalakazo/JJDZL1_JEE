package com.infoshare.academy.jee.basics.repository;


import com.infoshare.academy.jee.basics.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    private static List<User> usersRepository = new ArrayList<>();

    public static List<User> getUsers() {
        if (usersRepository.size() == 0) {
            fillRepositoryWithDefaults();
        }
        return usersRepository;
    }

    private static void fillRepositoryWithDefaults() {
        User user1 = new User(1, "Jan", "Muzykant", "secret", 21);
        usersRepository.add(user1);

        User user2 = new User(2, "Adam", "Ad", "admin", 35);
        usersRepository.add(user2);

        User user3 = new User(3, "Zuzanna", "Zuz", "1234", 32);
        usersRepository.add(user3);
    }

    public static boolean contains(User user) {
        List<User> repository = getUsers();
        for (User userFromList : repository) {
            if (userFromList.getId() == user.getId()) {
                return true;
            }
        }
        return false;
    }
}

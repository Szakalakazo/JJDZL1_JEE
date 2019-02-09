package com.infoshare.academy.jee.basics.cdi;

import com.infoshare.academy.jee.basics.dao.UsersRepositoryDao;
import com.infoshare.academy.jee.basics.domain.User;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;


@RequestScoped
public class RandomUserCDIRequestDaoBean implements RandomUserCDIRequestDao, Serializable {


    private int index = (int) (Math.random() * 3) + 1;

    @EJB
    UsersRepositoryDao dao;

    @Override
    public User getRandomUser() {
        return dao.getUserById(index);
    }
}

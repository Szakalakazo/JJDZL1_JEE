package com.infoshare.academy.jee.basics.cdi;

import com.infoshare.academy.jee.basics.dao.UsersRepositoryDao;
import com.infoshare.academy.jee.basics.domain.User;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;

@ApplicationScoped
public class RandomUserCDIApplicationDaoBean implements RandomUserCDIApplicationDao, Serializable {

    private static final long serialVersionUID = -8380879958136475324L;

    private int index = (int) (Math.random() * 3) + 1;

    @EJB
    UsersRepositoryDao dao;

    @Override
    public User getRandomUser() {
        return dao.getUserById(index);
    }
}

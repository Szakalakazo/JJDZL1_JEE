package com.infoshare.academy.jee.basics.cdi;

import com.infoshare.academy.jee.basics.dao.UsersRepositoryDao;
import com.infoshare.academy.jee.basics.domain.User;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class RandomUserCDISessionDaoBean implements RandomUserCDISessionDao, Serializable {

    private static final long serialVersionUID = -4072526546199297506L;

    private int index = (int) (Math.random() * 3) + 1;

    @EJB
    UsersRepositoryDao dao;

    @Override
    public User getRandomUser() {
        return dao.getUserById(index);
    }
}

package com.infoshare.academy.jee.basics.servlets;


import com.infoshare.academy.jee.basics.dao.UsersRepositoryDao;
import com.infoshare.academy.jee.basics.dao.UsersRepositoryDaoBean;
import com.infoshare.academy.jee.basics.domain.User;
import com.infoshare.academy.jee.basics.repository.UsersRepository;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/users-list")
public class UsersListServlet extends HttpServlet {


    @EJB
    private UsersRepositoryDao dao;




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter pw = response.getWriter();

        //UsersRepositoryDao usersRepositoryDao = new UsersRepositoryDaoBean();



        List<User> list = dao.getUsersList();

        if (list.size() > 0) {
            for (User user : list) {
                pw.write(user.toString());
                pw.write("<br/>");
            }
        } else {
            pw.write("List is empty!");
        }
        response.setContentType("text/html");

    }
}

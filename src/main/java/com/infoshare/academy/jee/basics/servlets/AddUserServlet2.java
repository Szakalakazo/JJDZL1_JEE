package com.infoshare.academy.jee.basics.servlets;


import com.infoshare.academy.jee.basics.dao.UsersRepositoryDao;
import com.infoshare.academy.jee.basics.dao.UsersRepositoryDaoBean;
import com.infoshare.academy.jee.basics.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add-user")
public class AddUserServlet2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name =req.getParameter("name");
        String login =req.getParameter("login");
        String password =req.getParameter("password");
        String age =req.getParameter("age");

        User user = new User(Integer.valueOf(id), name, login, password, Integer.valueOf(age));

        UsersRepositoryDao dao = new UsersRepositoryDaoBean();

        dao.addUser(user);

        PrintWriter pw = resp.getWriter();
        pw.write("Success!");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.write("Success!");
    }
}

package com.infoshare.academy.jee.basics.servlets;

import com.infoshare.academy.jee.basics.dao.UsersRepositoryDao;
import com.infoshare.academy.jee.basics.dao.UsersRepositoryDaoBean;
import com.infoshare.academy.jee.basics.domain.User;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/add-user-no-id")
public class AddUserServlet extends HttpServlet {

    @EJB
    private UsersRepositoryDao dao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        RequestDispatcher rq = request.getRequestDispatcher("add-user-no-id.html");
        rq.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //UsersRepositoryDao dao = new UsersRepositoryDaoBean();
        int id = dao.getUsersList().size();
        PrintWriter pw = response.getWriter();

        String name = request.getParameter("name");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String age = request.getParameter("age");


        if ((name == null | name.isEmpty()) | (login == null | login.isEmpty()) | (password == null | password.isEmpty()) | (age == null | age.isEmpty())) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {

            id++;
            User newUser = new User(id, name, login, password, Integer.parseInt(age));
            dao.addUser(newUser);

            pw.write("Siała baba mak");
        }
    }
}
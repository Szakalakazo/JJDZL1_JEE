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


@WebServlet("/find-user-by-id")
public class FindUSerByIdServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");

        UsersRepositoryDao dao = new UsersRepositoryDaoBean();

        PrintWriter printWriter = response.getWriter();


        if (request.getParameter("id") == null || request.getParameter("id").isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        } else {

            try {
                User userById = dao.getUserById(Integer.valueOf(id));
                printWriter.write("User ID: " + userById.getId());
                printWriter.write("\nUser name: " + userById.getName());
                printWriter.write("\nUser login: " + userById.getLogin());
                printWriter.write("\nUser age: " + userById.getAge());


            } catch (IllegalArgumentException exc) {
                printWriter.write("User with this Id does not exist!");
            }
        }
    }
}

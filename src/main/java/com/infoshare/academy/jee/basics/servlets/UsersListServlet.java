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
import java.util.List;

@WebServlet("/users-list")
public class UsersListServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        PrintWriter pw = response.getWriter();
        UsersRepositoryDao usersRepositoryDao = new UsersRepositoryDaoBean();

        List<User> list = usersRepositoryDao.getUsersList();

        if (list.size() > 0) {
            for (User user : list) {
                pw.write(user.toString());
                pw.write("\n");
            }
            //pw.println("<br><a href=index.html>Back</a>");
        } else {
            pw.write("List is empty!");
        }

    }
}

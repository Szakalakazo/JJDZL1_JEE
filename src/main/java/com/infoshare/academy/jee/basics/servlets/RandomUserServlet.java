package com.infoshare.academy.jee.basics.servlets;


import com.infoshare.academy.jee.basics.cdi.RandomUserCDIApplicationDao;
import com.infoshare.academy.jee.basics.cdi.RandomUserCDIRequestDao;
import com.infoshare.academy.jee.basics.cdi.RandomUserCDISessionDao;
import com.infoshare.academy.jee.basics.domain.User;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/random-user")
public class RandomUserServlet extends HttpServlet {

    @Inject
    private RandomUserCDIRequestDao requestDao;

    @Inject
    private RandomUserCDISessionDao sessionDao;

    @Inject
    private RandomUserCDIApplicationDao applicationDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();

        User applicationUser = applicationDao.getRandomUser();
        User requestUser = requestDao.getRandomUser();
        User sessionUser = sessionDao.getRandomUser();

        pw.write("User by application scope:");
        pw.write(applicationUser.toString());
        pw.write("\n");
        pw.write("User by session scope:");
        pw.write(sessionUser.toString());
        pw.write("\n");
        pw.write("User by request scope");
        pw.write(requestUser.toString());
        pw.write("\n");


    }
}

package com.infoshare.academy.jee.basics.servlets;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("Hello from my first Servlet!");
        response.setContentType("text/html;charset=UTF-8");

    }
}


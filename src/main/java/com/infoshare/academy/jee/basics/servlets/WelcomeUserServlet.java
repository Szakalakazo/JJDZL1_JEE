package com.infoshare.academy.jee.basics.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome-user")
public class WelcomeUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();

        if (request.getParameter("name") == null || name.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {



        /*
        writer.write("<DOCTYPE html><html><body>");
        writer.write("<h1>Hello " + name + "</h1>");
        writer.write("</html></body>");
        */
            writer.write("<html lang=\"en\">\n" + "  <head>\n" + "    <!-- Required meta tags -->\n" + "    <meta charset=\"utf-8\">\n" + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" + "\n" + "    <!-- Bootstrap CSS -->\n" + "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n" + "\n" + "    <title>Hello, world!</title>\n" + "  </head>\n" + "  <body>\n" + "\n" + "    <div class=\"jumbotron jumbotron-fluid bg-info text-white text-center\" style=\"background: grey\">\n" + "      <div class=\"container\">\n" + "        <h1 class=\"display-1\">Welcome " + name + "</h1>\n" + "        <p class=\"lead\">JavaEE Tutorial</p>\n" + "      </div>\n" + "    </div>\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "    <!-- Optional JavaScript -->\n" + "    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n" + "    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n" + "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n" + "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n" + "  </body>\n" + "</html>\n");

        }
    }
}

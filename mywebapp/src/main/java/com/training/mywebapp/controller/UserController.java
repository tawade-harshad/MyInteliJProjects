package com.training.mywebapp.controller;

import com.training.mywebapp.exception.UserNotFoundException;
import com.training.mywebapp.model.User;
import com.training.mywebapp.service.UserService;
import com.training.mywebapp.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="*.do")
public class UserController extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String path = request.getServletPath();
        PrintWriter out = response.getWriter();

        if(path.equals("/login.do")){
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            try{
                User user = userService.authenticateUser(username,password);
                out.println("<h3> Login Successful</h3>");
                out.println("<h4> Welcome : " + username + "</h4>");

            }catch (UserNotFoundException e){

                out.println("<h3 style='color: red'>" + e.getMessage() + "</h3>");
                out.println("<a href='loginPage.jsp'> Sign In Again </a>");

            }

        }
        else if(path.equals("/register.do")){

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String emailId = request.getParameter("emailId");
            long contact = Long.parseLong(request.getParameter("contact"));

            User user = new User(username,password,emailId,contact);
            userService.registerNewUser(user);

            out.println("<h3> Registration Successful</h3>");
            out.println("<h3><a href='loginPage.jsp'> Sign In </a></h3>");
        }

        out.close();
    }

}

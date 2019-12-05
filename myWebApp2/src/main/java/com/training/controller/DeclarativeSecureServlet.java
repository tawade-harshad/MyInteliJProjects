package com.training.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DeclarativeSecureServlet")
public class DeclarativeSecureServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            PrintWriter pw = response.getWriter();
            String name = request.getParameter("username");
            pw.println("Welcome, " + name + "!");
            pw.println("<br> You are seeing this page because you are a supervisor.");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("Hello! HTTP GET request is open to all uers.");
    }
}

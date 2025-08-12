package com;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); // good
        RequestDispatcher rp = req.getRequestDispatcher("signup.html");
        rp.forward(req, resp); // forwards to signup.html
    }
}


//RequestDispatcher rp = req.getRequestDispatcher("hello.html");
/*
 How to get the HTML file or connect the Servlet
 What is the relation between the servlet and the html 
 We have to forward the servlet to the html file 
 we have a method called request.getRequestDispatchet("where we mention our html page");
 rp -> request Dispatcher -> 
 */

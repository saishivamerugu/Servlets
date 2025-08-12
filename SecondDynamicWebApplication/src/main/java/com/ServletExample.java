package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/HiServlet")
public class ServletExample extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.append("<h1>Java Servlets</h1>");
    }
}

//WebServlet ... annotation used ... to write instead of the web.xml .... a simple replacement of the web.xml
//I want to return the HTML...
// Index.html -> default HTML which is loaded
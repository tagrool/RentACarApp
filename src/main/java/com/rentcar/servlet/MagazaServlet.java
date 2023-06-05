package com.rentcar.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "magazaServlet", value = "/magazaservlet")
public class MagazaServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Mağaza</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Mağaza</h1>");
        out.println("<form action='register' method='get'>");
        out.println("<input type='submit' value='Register'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}
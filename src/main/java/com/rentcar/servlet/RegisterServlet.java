package com.rentcar.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // TODO: Kayıt işlemlerini gerçekleştirin

        response.setContentType("text/html;charset=UTF-8");
        System.out.println("sdaasdsa");
//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Register</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>Kayıt Başarılı!</h1>");
//        out.println("<a href='magaza'>Mağazaya Geri Dön</a>");
//        out.println("</body>");
//        out.println("</html>");
    }
}

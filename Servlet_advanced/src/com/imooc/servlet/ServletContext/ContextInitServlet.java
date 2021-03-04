package com.imooc.servlet.ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/context/init")
public class ContextInitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        String copyright = context.getInitParameter("copyright");

        context.setAttribute("copyright","@ 2020 www.imooc.com 京");
        context.setAttribute("title","慕课网-程序员的梦工厂");
        resp.getWriter().println("Init Success");
    }
}

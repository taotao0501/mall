package com.imooc.ServletDemo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleServlet extends HttpServlet {
    //service是请求处理的核心方法,无论是get或者post都会被service()方法处理
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String method = request.getMethod();
        String name = request.getParameter("name");
        String mobile = request.getParameter("mobile");
        String[] specs = request.getParameterValues("spec");
        PrintWriter out = response.getWriter();
        out.println("<h1>Method:" + method + "</h1>");
        out.println("<h1>Name:" + name + "</h1>");
        out.println("<h1>mobile:" + mobile + "</h1>");
        for(String spec:specs) {
            out.println("<h2>spec:" + spec + "</h2>");
        }
        out.println("<a href='http://www.baidu.com'>baidu</a>");
    }
}

package com.imooc.servlet.direct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/direct/check")
public class CheckLoginServelt extends HttpServlet {
    public CheckLoginServelt(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("用户登陆成功！");

        req.setAttribute("username","admin");
        //实现了请求转发的功能
        req.getRequestDispatcher("/direct/index").forward(req,resp);



        // 响应重定向 需要增加 contextPath
        //resp.sendRedirect("/Servlet_advanced_war_exploded/direct/index");

    }
}

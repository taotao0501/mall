package com.imooc.jstl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/jstl")
public class JstlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("score", 58);
        req.setAttribute("grade","B");
        //req.getRequestDispatcher("/core.jsp").forward(req,resp);

        List<Company> list = new ArrayList<>();
        list.add(new Company("腾讯","www.tencent.com"));
        list.add(new Company("百度","www.baidu.com"));
        list.add(new Company("慕课网","www.imooc.com"));

        req.setAttribute("company_list", list);
        req.getRequestDispatcher("/core.jsp").forward(req,resp);

    }
}

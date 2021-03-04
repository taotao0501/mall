package com.imooc.servlet.charset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/charset/process")
public class CharsetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //对于Tomcat.8及以上的版本，默认get请求发送中文就是UTF-8，但是低版本需要转换，需要在Tomcat安装目录下 conf/server.xml修改
        String ename = req.getParameter("ename");
        String address = req.getParameter("address");
        System.out.println(ename + ":" + address);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // setCharacterEncoding()方法用于将请求体中的字符集转换成UTF-8，因此只适用于post请求
        req.setCharacterEncoding("UTF-8");
        String ename = req.getParameter("ename");
        String address = req.getParameter("address");

        //String utf8ename = new String(ename.getBytes("iso-8859-1"), "utf-8");
        System.out.println(ename + ":" + address);
    }
}

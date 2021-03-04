package com.imooc.servlet.session;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/session/login")
public class SessionLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("登录成功");
        HttpSession session = req.getSession();
        String sessionId = session.getId();
        System.out.println(sessionId);
        session.setAttribute("name","张三");
        req.getRequestDispatcher("/session/index").forward(req,resp);
    }
}

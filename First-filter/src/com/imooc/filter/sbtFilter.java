package com.imooc.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class sbtFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request; //强制转换
        req.setCharacterEncoding("UTF-8");
        HttpServletResponse resp = (HttpServletResponse) response;
        resp.setContentType("text/html;charset=UTF-8");
        chain.doFilter(req,resp);

    }

    @Override
    public void destroy() {

    }
}

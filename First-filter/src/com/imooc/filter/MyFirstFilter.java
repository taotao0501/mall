package com.imooc.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//public class MyFirstFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("过滤器初始化成功");
//    }
//
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
//        System.out.println("过滤器已生效");
//        chain.doFilter(req,resp);//过滤连传递
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("过滤器已被销毁");
//    }
//}

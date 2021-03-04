package com.imooc.employee;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/create")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String empno = req.getParameter("empno");
        String ename = req.getParameter("ename");
        String department = req.getParameter("department");
        String job = req.getParameter("job");
        String salary = req.getParameter("salary");
        System.out.println(empno);
        Employee emp = new Employee(Integer.parseInt(empno),ename,department,job,Float.parseFloat(salary));

        ServletContext context = req.getServletContext();
        List<Employee> emp_list = (List)context.getAttribute("employees");
        emp_list.add(emp);
        context.setAttribute("employees", emp_list);
        req.getRequestDispatcher("/employee.jsp").forward(req,resp);

    }
}

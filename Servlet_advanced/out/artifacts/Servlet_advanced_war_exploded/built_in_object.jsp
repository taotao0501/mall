<%--
  Created by IntelliJ IDEA.
  User: sbt
  Date: 2021/1/30
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String url = request.getRequestURL().toString();
        response.getWriter().println(url);
    %>

    <%
    out.println("<br>ABCCD");
    session.setAttribute("user","张三");
    out.println((String) session.getAttribute("user"));
    %>

    <%
        String cp = application.getInitParameter("copyright");
        out.println("<hr/>");
        out.println(cp);
        pageContext.getRequest();
        pageContext.getException();
    %>

</body>
</html>

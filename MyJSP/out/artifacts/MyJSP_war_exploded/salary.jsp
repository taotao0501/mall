<%--
  Created by IntelliJ IDEA.
  User: sbt
  Date: 2021/1/20
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>year</th>
        <th>salary</th>
    </tr>
    <tr>
        <%
            for (int i=0;i<=20;i++) {
                out.println("<tr>");
                out.println("<td>" + i + "</td>");
                out.println("<td>" + 1500*Math.pow(1.1,i) + "</td>");
                out.println("<tr>");
                out.println("<tr>");
            }
        %>
    </tr>
</table>
</body>
</html>

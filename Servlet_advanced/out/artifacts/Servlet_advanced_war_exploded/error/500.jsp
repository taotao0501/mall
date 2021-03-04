<%--
  Created by IntelliJ IDEA.
  User: sbt
  Date: 2021/1/30
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    服务器内部错误，请联系管理员，错误信息如下：
<%
    String msg = exception.getMessage();
    out.println("<br>" + exception.getClass().getSimpleName() + ":" + msg);
%>
</body>
</html>

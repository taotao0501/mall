<%--
  Created by IntelliJ IDEA.
  User: sbt
  Date: 2021/2/1
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>姓名：${sessionScope.student.name}</h1>
    <h2>手机：${sessionScope.student.mobile}</h2>
    <h2>教师评级: ${sessionScope.grade}</h2>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: sbt
  Date: 2021/2/1
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>分数：${requestScope.score}</h1>
    <!--if 条件选择-->
    <c:if test = "${requestScope.score >= 60}">
        <h1 style="color:green">恭喜，及格了</h1>
    </c:if>
    <c:if test="${requestScope.score < 60}">
        <h1 style = "color:red">抱歉，再接再厉</h1>
    </c:if>

    <!--choose when otherwise-->
    <h1>等级：${grade}</h1>
    <c:choose>
        <c:when test="${grade == 'A'}">
            <h2>你很优秀</h2>
        </c:when>

        <c:when test="${grade == 'B'}">
            <h2>不错呀</h2>
        </c:when>

        <c:when test="${grade == 'C'}">
            <h2>水平一般</h2>
        </c:when>

        <c:when test="${grade == 'D'}">
            <h2>需要努力啦</h2>
        </c:when>
    </c:choose>


    <!-- forEach标签用于遍历集合
        List companies = (List) request.getAttribute("company_list");
        for(Company c:company_list){
            out.println("...");
        }
    -->
    <c:forEach items="${requestScope.company_list}" var="c">
        <h2 style="color:green"> ${c.name} - ${c.url}</h2>
    </c:forEach>

</body>
</html>

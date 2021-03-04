<%--
  Created by IntelliJ IDEA.
  User: sbt
  Date: 2021/2/1
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("amt", 1987654.324);
    request.setAttribute("now", new java.util.Date());
    request.setAttribute("html", "<a href='index.html'>index</a>");
    request.setAttribute("nothing", null);
%>
    <h2>${now}</h2>
    <br>
    <h2>
        <fmt:formatDate value="${requestScope.now}" pattern="yyyy年MM月dd日HH时mm分ss秒"/>
    </h2>

    <h2>${amt}</h2>
    <br>
    <h2>
        <%-- 千分位分割--%>
        人民币<fmt:formatNumber value="${amt}" pattern="0,000.00"/>
    </h2>

    <h2>null默认值： <c:out value="${nothing} " default="无"></c:out></h2>

    <h2>${html}</h2>
    <h2><c:out value="${html}" escapeXml="true"></c:out></h2>

</body>
</html>


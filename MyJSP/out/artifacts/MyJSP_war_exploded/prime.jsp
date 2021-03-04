<%--
  Created by IntelliJ IDEA.
  User: sbt
  Date: 2021/1/20
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%!
    boolean isPrime(int num){
        boolean flag=true;
        for(int i =2;i<num;i++){
            if(num % i ==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
%>

<%
    List<Integer> primes = new ArrayList();

    for(int i=2;i<=100;i++){
        boolean flag = isPrime(i);
        if(flag == true)
            primes.add(i);

    }
%>

<%
    for(int p:primes) {
        out.println("<h1>" + p + "是素数</h1>");
    }
%>

</body>
</html>

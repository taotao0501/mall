<%--
  Created by IntelliJ IDEA.
  User: sbt
  Date: 2021/2/9
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>PaintingShopSBT</title>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <script type="text/javascript" src="js/js1.js"></script>
</head>
<body>
<div class="header">
    <div class="logo">
        <img src="image/logo.png">
    </div>
    <div class="menu" onmouseleave="close_menu()">
        <div class="menu_title" onclick="show_menu()">
            <a href="#">内容分类</a>
        </div>
        <ul id = "menu1">
            <li>现实主义</li>
            <li>抽象主义</li>
        </ul>
    </div>
    <div class="user">
        <ul>
            <li><a href="#">注册</a></li>
            <li><a href="#">登录</a></li>
        </ul>
    </div>
</div>
<div class="content">
    <div class="banner">
        <img src="image/welcome.png" class="banner_img">
    </div>
    <div class="img-content">
        <ul>
            <li>
                <img src="image/wumingnvlang.jpg" class="img-li">
                <div class="info">
                    <h3>无名女郎</h3>
                    <p>
                        图片描述可以分为多种，一种是单一说明，就比如直接的告诉看图者这篇文 章是要介绍什么样子的内容，一些配图可以分为含蓄类型的，这样的配图一般会 图片描述可以分为多种.
                    </p>
                    <div class="img-btn">
                        <div class="price">￥9999</div>
                        <a href="#" class="cart">
                            <div class="btn">
                                <img src="image/cart.svg">
                            </div>
                        </a>
                    </div>
                </div>
            </li>


            <c:forEach items="${pageModel.pageData}" var="painting">
                <li>
                    <img src="${painting.preview}" class="img-li">
                    <div class="info">
                        <h3>${painting.pname}</h3>
                        <p>
                            ${painting.description }
                        </p>
                        <div class="img-btn">
                            <div class="price"><fmt:formatNumber pattern="0.00" value="${painting.price}"></fmt:formatNumber></div>
                            <a href="#" class="cart">
                                <div class="btn">
                                    <img src="image/cart.svg">
                                </div>
                            </a>
                        </div>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>
    <div class="page-nav">
        <ul>
            <li><a href="#">首页</a></li>
            <li><a href="#">上一页</a></li>
            <li><span class="first-page">1</span></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">...</a></li>
            <li><a href="#">98</a></li>
            <li><a href="#">99</a></li>
            <li><a href="#">100</a></li>
            <li><a href="#">下一页</a></li>
            <li><a href="#">尾页</a></li>
        </ul>
    </div>
</div>
<div class="footer">
    <p><span>M-GALLARY</span>©2020 POWERED BY MINOS-TY</p>
</div>
</body>
</html>

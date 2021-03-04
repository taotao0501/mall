<%--
  Created by IntelliJ IDEA.
  User: sbt
  Date: 2021/2/2
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>员工列表</title>
    <link rel="stylesheet" href="jscs/css/bootstrap.min.css" type="text/css">
    <script type="text/javascript" src="jscs/js/jquery-3.5.1.min.js"></script>
    <script type="text/javascript" src="jscs/js/bootstrap.min.js"></script>

    <script>
        $(function(){
            $("#btnAdd").click(function(){
                $('#dlgForm').modal()
            })
        })
    </script>
</head>
<body>
<div>
    <div class="container">
        <div class="row">
            <h1 style="text-align:center">IMOOC员工信息表</h1>
            <div class="panel panel-default">
                <div class="clearfix">
                    <div class="input-group" style="width:500px">
                        <button class="btn btn-primary" id="btnAdd">
                            <span>新增</span>
                        </button>
                    </div>
                </div>

                <table class="table table-bordered table-hover">
                    <thead>
                    <tr>
                        <th>序号</th>
                        <th>员工编号</th>
                        <th>姓名</th>
                        <th>部门</th>
                        <th>职务</th>
                        <th>工资</th>
                        <th>&nbsp;</th>
                    </tr>
                    </thead>

                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>7782</td>
                        <td>张晓涛</td>
                        <td>研发部</td>
                        <td>研发工程师</td>
                        <td style="color:red;font-weight: bold">7,708.00</td>
                    </tr>

                    <c:forEach items="${applicationScope.employees}" var="emp" varStatus="idx">
                        <tr>
                            <td>${idx.index + 2}</td>
                            <td>${emp.empno}</td>
                            <td>${emp.ename}</td>
                            <td>${emp.department}</td>
                            <td>${emp.job}</td>
                            <td style="color:red;font-weight: bold"><fmt:formatNumber value="${emp.salary}" pattern="0,000.00"></fmt:formatNumber></td>
                        </tr>
                    </c:forEach>


                    </tbody>
                </table>

            </div>
        </div>
    </div>


    <%-- modal弹窗--%>
    <div class="modal fade" tabindex="-1" role="dialog" id="dlgForm">
        <div class="modal-dialog" role="document"></div>
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"></button>
                <h4 class="modal-title">新增员工</h4>
            </div>

            <div class="modal-body">
                <form action="/Servlet_advanced_war_exploded/create" method="post">
                    <div class="form-group">
                        <label>员工编号</label>
                        <input type="text" name="empno" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>员工姓名</label>
                        <input type="text" name="ename" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>部门</label>
                        <select id="dname" name="department" class="form-control">
                            <option selected="selected">请选择部门</option>
                            <option value="市场部">市场部</option>
                            <option value="研发部">研发部</option>
                            <option value="人事部">人事部</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>职位</label>
                        <input type="text" name="job" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>工资</label>
                        <input type="text" name="salary" class="form-control">
                    </div>

                    <div>
                        <input type="submit" value="提交">
                    </div>
                </form>
            </div>
        </div>
    </div>

</div>

</body>
</html>

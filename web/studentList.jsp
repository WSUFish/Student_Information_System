<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2019/4/9
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生信息管理系统</title>
    <script type="text/javascript">
        function doDelete(id) {
            var flag = confirm("确定删除？");
            if (flag) {
                location.href = "deleteServlet?id=" + id;
            }
        }
        function doEdit(id) {
            location.href = "editServlet?id=" + id;
        }
    </script>
    <link rel="stylesheet" type="text/css" href="StudentTableCSS.css">
</head>
<body>
<br>
<h2>学生列表</h2>
<br>
<form action="searchServlet" method="post">
    <table border="1" width="700">
        <tr>
            <td colspan="8"><a href="addStudent.jsp">添加学生</a></td>
        </tr>
        <tr>
            <td colspan="8">
                按学号查询<input type="text" name="num">
                &nbsp;
                按姓名查询<input type="text" name="name">
                &nbsp;
                <input type="submit" value="查询">
            </td>
        </tr>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>电话</th>
            <th>邮箱</th>
            <th>地址</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="stu">
            <tr>
                <td>${stu.num}</td>
                <td>${stu.name}</td>
                <td>${stu.sex}</td>
                <td>${stu.phone}</td>
                <td>${stu.email}</td>
                <td>${stu.address}</td>
                <td><input type="button" value="编辑" onclick="doEdit(${stu.id})">&nbsp;&nbsp;<input type="button" value="删除" onclick="doDelete(${stu.id})"></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>

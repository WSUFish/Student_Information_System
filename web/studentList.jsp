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
</head>
<body>
<br>学生列表<br>
<table border="1" width="700">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>电话</td>
        <td>邮箱</td>
        <td>地址</td>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <td>${stu.num}</td>
            <td>${stu.name}</td>
            <td>${stu.age}</td>
            <td>${stu.sex}</td>
            <td>${stu.phone}</td>
            <td>${stu.email}</td>
            <td>${stu.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

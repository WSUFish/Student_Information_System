<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2019/4/14
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>编辑学生信息</title>
    <link rel="stylesheet" type="text/css" href="StudentTableCSS.css">
</head>
<body>
<form method="post" action="updateServlet">
    <input type="hidden" name="id" value="${stu.id}">
    <table border="1" width="300">
        <tr>
            <th>学号</th>
            <td><input type="text" name="num" value="${stu.num}"></td>
        </tr>
        <tr>
            <th>姓名</th>
            <td><input type="text" name="name" value="${stu.name}"></td>
        </tr>
        <tr>
            <th>性别</th>
            <td>
                <input type="radio" name="sex" value="男"
                       <c:if test="${stu.sex == '男'}">checked</c:if>
                >男
                <input type="radio" name="sex" value="女"
                       <c:if test="${stu.sex == '女'}">checked</c:if>
                >女
            </td>
        </tr>
        <tr>
            <th>电话</th>
            <td><input type="text" name="phone" value="${stu.phone}"></td>
        </tr>
        <tr>
            <th>邮箱</th>
            <td><input type="text" name="email" value="${stu.email}"></td>
        </tr>
        <tr>
            <th>地址</th>
            <td><input type="text" name="address" value="${stu.address}"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="保存"></td>
        </tr>
    </table>
</form>
</body>
</html>

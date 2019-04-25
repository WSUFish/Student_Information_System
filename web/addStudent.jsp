<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2019/4/14
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="StudentTableCSS.css">
</head>
<body>
<form method="post" action="addStudent">
    <table border="1" width="700">
        <tr>
            <th>学号</th>
            <td><input type="text" name="num"></td>
        </tr>
        <tr>
            <th>姓名</th>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <th>性别</th>
            <td>
                <input type="radio" name="sex" value="男">男
                <input type="radio" name="sex" value="女">女
            </td>
        </tr>
        <tr>
            <th>电话</th>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <th>邮箱</th>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <th>地址</th>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="增加"></td>
        </tr>
    </table>
</form>
</body>
</html>

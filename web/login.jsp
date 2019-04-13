<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2019/4/8
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h2 style="text-align:center">欢迎使用学生信息管理系统</h2>
<form action="login_servlet" method="post" style="text-align:center">
    账号:<input type="text" name="username" /><br>
    密码:<input type="text" name="password" /><br>
    <input type="submit" value="登录"><br>
</form>
</body>
</html>

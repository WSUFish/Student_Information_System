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
        function doDelete(id){
            var flag=confirm("确定删除？");
            if(flag){
                window.event.returnValue=false;
                location.href="deleteServlet?id="+id;
            }
        }
    </script>
</head>
<body>
<br>学生列表<br>
<table border="1" width="700">
    <tr>
        <td colspan="8"><a href="addStudent.jsp">添加学生</a></td>
    </tr>
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>电话</td>
        <td>邮箱</td>
        <td>地址</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <td>${stu.num}</td>
            <td>${stu.name}</td>
            <td>${stu.sex}</td>
            <td>${stu.phone}</td>
            <td>${stu.email}</td>
            <td>${stu.address}</td>
            <td><a href="editServlet?id=${stu.id}">修改</a>  <a href="" onclick="doDelete(${stu.id})">删除</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

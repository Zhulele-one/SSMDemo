<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-09-23
  Time: 09:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>学生管理信息查询</title>
</head>
<body >


<h2 align="center">学生管理信息查询</h2>

<hr>

<form action="${pageContext.request.contextPath}/searchByNameAndScore" method="get" align="center">
    姓名：<input type="text" name="name"  >

    分数：<input type="text" name="score" id="score">

    <input type="submit" value="查询">
</form>



<form action="${pageContext.request.contextPath}/getByName" method="get">
    姓名：<input type="text" name="name">
    <input type="submit" value="查询">
</form>

<hr/>

<p>
    <a href="add.jsp" style="margin-left:200px;">添加</a>
</p>

<table border="1" cellSpacing="0" align="center" width="800px">
    <thead>
    <tr>
        <th>头像</th>
        <th>姓名</th>
        <th>性别</th>
        <th>成绩</th>
        <th>班级</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${stus}" var="stu">
        <tr align="center">
            <th><img src="${pageContext.request.contextPath}/${stu.nickname}" width="100px;height:100px"/></th>
            <td>${stu.name}</td>
            <td>${stu.sex}</td>
            <td>${stu.score}</td>
            <th>${stu.banji.name}</th>
            <td >
                <a href="findById?id=${stu.id}">编辑</a>
                <a href="deleteStudent?id=${stu.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>

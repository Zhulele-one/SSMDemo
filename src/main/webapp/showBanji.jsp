<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"  %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询班级里的所有学生信息</title>
</head>
<body>
<h2 align="center">查询班级里的所有学生信息</h2>

<hr>

<form action="${pageContext.request.contextPath}/searchBanji" method="get" align="center">
        班级：
        <select id='banji' name="name">
            <option name="计科一班" value="计科一班">计科一班</option>
            <option name="计科二班" value="计科二班">计科二班</option>
            <option name="计科三班" value="计科三班">计科三班</option>
        </select>
    <input type="submit" value="查询">
</form>


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
            <th>${stu.nickname}</th>
            <td>${stu.name}</td>
            <td>${stu.sex}</td>
            <td>${stu.score}</td>
            <th>${stu.banji.id}</th>
            <td >
                <a href="findById?id=${stu.banji.id}">编辑</a>
                <a href="deleteStudent?id=${stu.banji.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

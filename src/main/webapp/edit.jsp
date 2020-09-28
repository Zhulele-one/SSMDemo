<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/edit" method="post">

    <input type="hidden" name="id" value="${stu.id}">

    姓名：<input type="text" name="name" id="name" value="${stu.name}"> <br>
    性别：<input type="text" name="sex" id="sex" value="${stu.sex}"> <br>
    成绩：<input type="text" name="score" id="score" value="${stu.score}"> <br>

    <input type="submit" value="添加">
</form>
</body>
</html>

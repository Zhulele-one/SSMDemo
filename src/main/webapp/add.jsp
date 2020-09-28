<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data" >
    姓名：<input type="text" name="name" id="name" value="${stu.name}"> <br>
    性别：<input type="text" name="sex" id="count" value="${stu.sex}"> <br>
    成绩：<input type="text" name="score" id="score" value="${stu.score}"> <br>
    头像：<input type="file" name="file" ><br/>
    班级：
    <select id='banji' name="banji.id">
        <option value="1" name="1">计科一班</option>
        <option value="2" name="2">计科二班</option>
        <option value="3"name="3">计科三班</option>
    </select>
    <input type="submit"  value="添加"><br/>
</form>
<%--<form action="${pageContext.request.contextPath}/insertStudent" method="post">--%>
    <%----%>
    <%--<input type="submit" value="添加">--%>
<%--</form>--%>
</body>
</html>

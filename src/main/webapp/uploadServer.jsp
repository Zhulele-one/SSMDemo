<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--  跨服务器图片上传--%>
<form action="${pageContext.request.contextPath}/uploadserver" method="post" enctype="multipart/form-data" >
    用户名：<input type="text" name="name" ><br/>
    文件上传：<input type="file" name="upload" ><br/>
    <input type="submit" ><br/>
</form>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<%--   文件上传 表单提交的方式--%>
<h1>文件上传</h1>
<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data" >
    用户名：<input type="text" name="name" ><br/>
    文件上传：<input type="file" name="file" ><br/>
    <input type="submit" ><br/>
</form>

<hr/>

<%-- 文件下载 --%>
<h1>文件下载</h1>
<a href="${pageContext.request.contextPath}/download?filename=1.jpg">下载</a>

<hr/>

<%--  跨服务器图片上传--%>
<form action="fileUpload2" method="post" enctype="multipart/form-data">
    名称：<input type="text" name="picname"/><br/>
    图片：<input type="file" name="uploadFile"/><br/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>

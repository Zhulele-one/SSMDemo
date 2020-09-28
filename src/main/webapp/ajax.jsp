<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-1.12.4.min.js"></script>
</head>
<body>
<button id="btn" >ajax</button>
<a href="test/testAjax">testAjax</a>
<script>
    //页面加载，绑定单击事件
    $(function(){
        $("#btn").click(function(){
            // alert("hello btn");
            //1.发送ajax请求
            $.ajax({
                url:"test/testAjax",
                contentType:"application/json;charset=UTF-8",
                data:'{"name":"huike","sex":"nan","score":"98"}',
                dataType:"json",
                type:"post",
                success:function(data){
                    //data服务器响应的json的数据，进行解析
                    console.log(data.name+data.sex+data.score)
                }
            });
        });
    });
</script>

</body>
</html>

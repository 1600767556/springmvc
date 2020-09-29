<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <%--<base href="http://localhost:8080/ch06_path" />--%>
    <base href="<%=basePath%>"/>
</head>
<body>
<P>一个拦截器</P>
<form action="some.do" method="post">
    姓名:<input type="text" name="name"><br/>
    年龄:<input type="text" name="age"><br/>
    <input type="submit" value="提交请求">

</form>
<br/>


</body>
<%--ch02_requestmapping--%>
</html>

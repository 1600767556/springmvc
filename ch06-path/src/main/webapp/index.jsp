
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
    <base href="<%=basePath%>" />
</head>
<body>
    <p>第一个springmvc项目</p>
    <%--绝对路径--%>
   <%-- <p><a href="${pageContext.request.contextPath}/user/some.do">发起的some.do的get请求</a> </p>--%>
    <%--相对路径--%>
    <p><a href="user/some.do">发起的some.do的get请求</a> </p>
</body>
<%--ch02_requestmapping--%>
</html>

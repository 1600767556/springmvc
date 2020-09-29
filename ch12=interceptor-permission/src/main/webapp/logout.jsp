<%--
  Created by IntelliJ IDEA.
  User: 辣鸡电脑
  Date: 2020/8/2
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    退出系统,从session中删除数据
    <%
        session.removeAttribute("name");
    %>
</body>
</html>

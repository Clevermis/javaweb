<%--
  Created by IntelliJ IDEA.
  User: clevermis
  Date: 2021/12/14
  Time: 上午3:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    HttpServletRequest req=(HttpServletRequest)pageContext.getRequest();
    String ip = request.getRemoteAddr();
    out.println("本机的IP地址为："+ip);
%>
</body>
</html>

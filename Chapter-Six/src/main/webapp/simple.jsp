<%--
  Created by IntelliJ IDEA.
  User: clevermis
  Date: 2021/12/14
  Time: 上午3:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<title>Insert title here</title>
<body>
当前访问时间是：
<%
    out.print(new java.util.Date().toLocaleString());
%>
</body>
</html>

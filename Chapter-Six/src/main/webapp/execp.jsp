<%--
  Created by IntelliJ IDEA.
  User: clevermis
  Date: 2021/12/14
  Time: 上午3:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isErrorPage="true"%>
<html>
<head>
    <title>Title</title>
</head>
<%
    out.println("exception.toString:");
    out.println("<br>");
    out.println(exception.toString());
    out.println("<p>");
    out.println("exception.getMessage():");
    out.println("<br>");
    out.println(exception.getMessage());%>
</html>

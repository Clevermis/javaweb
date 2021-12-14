<%--
  Created by IntelliJ IDEA.
  User: clevermis
  Date: 2021/12/14
  Time: 上午3:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page errorPage="execp.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<%
    String strprice=request.getParameter("price");
    double price=Double.parseDouble(strprice);
    out.println("Total price="+price*3);
%>
</html>

<%--
  Created by IntelliJ IDEA.
  User: clevermis
  Date: 2021/12/12
  Time: 下午10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%!
    int a = 1, b=2;
%>
<%!
    public String print(){
      String str = "clevermis";
    return str;
    }
%>
<body>
<%
    out.print(a+b);

%>
<br/>
<%
    out.print(print());

%>






</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: clevermis
  Date: 2021/12/14
  Time: 上午3:52
  @Description : 大概就这点东西，随机应变吧，这真没法总结了,就简单看一下里面通常写什么东西吧，然后自己在进行扩展就好了
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isErrorPage="true"%>
<%@ include file="date.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    int a = 1, b=2;

    public String print(){
        String str = "clevermis";
        return str;
    }
%>


<%
    int a=1/0;
    out.println("clevermis<br>");
    out.println(new java.util.Date().toLocaleString());
    out.print(print());
    out.print(a+b);
    out.println("exception.toString:");
    out.println("<br>");
    Thread.sleep(5000);

    response.getWriter().println("<br>");

    HttpServletRequest req=(HttpServletRequest)pageContext.getRequest();
    String ip = request.getRemoteAddr();
    out.println("本机的IP地址为："+ip);

    String strprice=request.getParameter("price");
    double price=Double.parseDouble(strprice);
    out.println("Total price="+price*3);

%>


<%=
(a/b)
%>

<jsp:include page="included.jsp" flush="true" />


</body>
</html>

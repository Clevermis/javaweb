package com.clevermis;

import java.awt.print.Book;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description 对servlet基础的一个大概总结，仅供参考。
 *              重点查看doGet里面的内容及注释下内容，尽量把注释下方法背下来,注意要会活学活用，方法是固定的但是其它东西要根据题中代码进行修改！！！！
 *              以下为提取：
 *              ***(先看下面的代码在来看这个，提取出来的下面均有注释！！！)
 *              （建议把这些原封不动全背下来，不然就...，大家都懂。。。。）
 *                            response.setContentType("text/html;charset=utf-8");
 *                            response.setCharacterEncoding("utf-8");
                              response.setContentType("text/html;charset=utf-8");
                              response.setHeader("Refresh","3");
                              OutputStream out=response.getOutputStream();
                              out.write();
                              PrintWriter out = response.getWriter();
                              out.println("Hello ,I‘m clevermis");
                              ServletConfig config = this.getServletConfig();
                              String param = config.getInitParameter("encoding");
                              ServletContext context1 = this.getServletContext();
                              Enumeration headerNames = request.getHeaderNames();
                              Enumeration<String> paramNames = context1.getInitParameterNames();
                              ServletContext context = this.getServletContext();
                              context.setAttribute("data", "this servlet save data");
                              String data = (String) context.getAttribute("data");
                              String username = request.getParameter("clevermis");
                              String[] clevermis1 = request.getParameterValues("clevermis");
                              response.sendRedirect("ogin.html");
                              RequestDispatcher rd = request.getRequestDispatcher("/download.html");
                              rd.forward(request, response);
                              rd.include(request, response);
                              HttpSession session = request.getSession();
                              List<Book> clevermis = (List) session.getAttribute("clevermis");
                              session.setAttribute("clevermis", clevermis);
                              Cookie cookie = new Cookie("clevermis", session.getId());
                              clevermis= (List) session.getAttribute("clevermis");
                              request.getSession().removeAttribute("clevermis");
 *
 *
 * @Classname Servlet基础复习
 * @Date 2021/12/14 上午2:22
 * @Created by clevermis
 */
public class Servlet基础复习 extends HttpServlet {
// this is doGet method
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    //设置字符编码
    response.setContentType("text/html;charset=utf-8");
    response.setCharacterEncoding("utf-8");
    // 每隔3秒定时刷新当前页面，记住setHeader以及Refresh
    response.setHeader("Refresh","3");


    String data="clevermis";
    // 获取输出流OutputStream对象
    OutputStream out0=response.getOutputStream();
    // 输出字符串信息
    out0.write(data.getBytes());


    // 得到输出流PrinterWriter对象,Servlet使用输出流来产生响应
    PrintWriter out = response.getWriter();
    // 使用输出流对象向客户端发送字符数据
    out.println("Hello World");

    // 获得ServletConfig对象
    ServletConfig config = this.getServletConfig();
    // 获得参数名为encoding对应的参数值
    String param = config.getInitParameter("encoding");


    // 得到ServletContext对象
    ServletContext context1 = this.getServletContext();

    // 获取请求消息中所有头字段
    Enumeration headerNames = request.getHeaderNames();
    // 使用循环遍历所有请求头，并通过getHeader()方法获取一个指定名称的头字段
    while (headerNames.hasMoreElements()) {
      String headerName = (String) headerNames.nextElement();
      out.print(headerName + " : " + request.getHeader(headerName)+ "<br>");
    }

    // 得到包含所有初始化参数名的Enumeration对象
    Enumeration<String> paramNames = context1.getInitParameterNames();
    // 遍历所有的初始化参数名，得到相应的参数值并打印
    while (paramNames.hasMoreElements()) {
      String name = paramNames.nextElement();
      String value = context1.getInitParameter(name);
      out.println(name + ": " + value);
      out.println("<br>");
    }


    ServletContext context2 = this.getServletContext();
    // 通过setAttribute()方法设置属性值
    context2.setAttribute("data", "this servlet save data");
    ServletContext context = this.getServletContext();
    // 通过getAttribute()方法获取属性值
    String data1 = (String) context.getAttribute("data");
    out.println(data1);


    // 用HttpServletRequest对象的getParameter()方法获取参数信息
    String username = request.getParameter("clevermis");
    // 获取参数名为“hobby”的值
    String[] clevermis1 = request.getParameterValues("clevermis");

    // 请求重定向到login.html
    response.sendRedirect("ogin.html");
    // 请求转发到download.html页面
    RequestDispatcher rd = request.getRequestDispatcher("/download.html");
      rd.forward(request, response);
      //请求包含
      rd.include(request, response);

    // 创建或者获取保存Session对象
    HttpSession session = request.getSession();
    // 从Session对象中获得clevermis
    List<Book> clevermis = (List) session.getAttribute("clevermis");
    // 将clevermis存入Session对象
    session.setAttribute("clevermis", clevermis);
    // 创建Cookie存放Session的标识号
    Cookie cookie = new Cookie("clevermis", session.getId());
    // 获得clevermis
    clevermis= (List) session.getAttribute("clevermis");
    // 将Session对象中的clevermis对象移除
    request.getSession().removeAttribute("clevermis");

  }



//  this is doPost method
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doGet(request,response);
  }

  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("init");
  }

  @Override
  public void service(ServletRequest servletRequest, ServletResponse servletResponse)
      throws ServletException, IOException {
    System.out.println("hello world");
  }


  @Override
  public void destroy() {
    System.out.println("destory");
  }

}

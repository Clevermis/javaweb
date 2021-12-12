package com.clevermis;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname LoginServlet
 * @Date 2021/12/12 下午3:36
 * @Created by clevermis
 */
public class LoginServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html;charset=utf-8");
    // 用HttpServletRequest对象的getParameter()方法获取用户名和密码
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    // 假设用户名和密码分别为：itcast和123
    if (("itcast").equals(username) &&("123").equals(password)) {
      // 如果用户名和密码正确，重定向到 welcome.html
      response.sendRedirect("/chapter05/welcome.html");
    } else {
      // 如果用户名和密码错误，重定向到login.html
      response.sendRedirect("/chapter05/login.html");
    }
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
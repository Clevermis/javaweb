package com.clevermis;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname LoginServlet
 * @Date 2021/12/12 下午5:02
 * @Created by clevermis
 */
public class LoginServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html;charset=utf-8");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String checkCode = request.getParameter("check_code");
    String savedCode = (String) request.getSession().getAttribute(
        "check_code");
    PrintWriter pw = response.getWriter();
    if (("itcast").equals(username) && ("123").equals(password)
        && checkCode.equals(savedCode)) {
      User user = new User();
      user.setUsername(username);
      user.setPassword(password);
      request.getSession().setAttribute("user", user);
      response.sendRedirect("/chapter06/IndexServlet");
    } else if (checkCode.equals(savedCode)) {
      pw.write("用户名或密码错误，登录失败");
    } else {
      pw.write("验证码错误");
    }
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
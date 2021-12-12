package com.clevermis;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname LogoutServlet
 * @Date 2021/12/12 下午5:05
 * @Created by clevermis
 */
public class LogoutServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // 将Session对象中的User对象移除
    request.getSession().removeAttribute("user");
    response.sendRedirect("/chapter06/IndexServlet");
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
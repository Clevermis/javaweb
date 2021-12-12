package com.clevermis;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname RefreshServlet
 * @Date 2021/12/12 下午3:23
 * @Created by clevermis
 */
public class RefreshServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // 每隔3秒定时刷新当前页面
    response.setHeader("Refresh","3");

    response.getWriter().println(new java.util.Date());// 输出当前时间
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}

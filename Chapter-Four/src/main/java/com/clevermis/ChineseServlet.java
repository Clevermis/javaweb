package com.clevermis;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname ChineseServlet
 * @Date 2021/12/12 下午3:18
 * @Created by clevermis
 */
public class ChineseServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    String data="中国";
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();
    out.println(data);
  }
  @Override
  public void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    doGet(request,response);
  }
}
package com.clevermis;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname IncludingServlet
 * @Date 2021/12/12 下午4:12
 * @Created by clevermis
 */
public class IncludingServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    RequestDispatcher rd = request
        .getRequestDispatcher("/IncludedServlet?p1=abc");
    out.println("before including" + "<br>");
    rd.include(request, response);
    out.println("after including" + "<br>");
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
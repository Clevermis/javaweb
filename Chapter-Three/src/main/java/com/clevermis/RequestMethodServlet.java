package com.clevermis;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname RequestMethodServlet
 * @Date 2021/12/11 下午5:46
 * @Created by clevermis
 */
public class RequestMethodServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter writer = resp.getWriter();
    writer.println("get");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter writer = resp.getWriter();
    writer.println("post");
  }
}

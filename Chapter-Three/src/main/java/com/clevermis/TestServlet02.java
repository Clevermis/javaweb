package com.clevermis;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname TestServlet02
 * @Date 2021/12/11 下午6:01
 * @Created by clevermis
 */
public class TestServlet02 extends HttpServlet {


  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    PrintWriter writer = resp.getWriter();
    ServletConfig servletConfig = this.getServletConfig();
    String encoding = servletConfig.getInitParameter("encoding");
    writer.println(encoding);

  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    this.doPost(req,resp);
  }
}

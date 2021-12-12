package com.clevermis;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname PrintServlet02
 * @Date 2021/12/12 下午3:16
 * @Created by clevermis
 */
public class PrintServlet02 extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws
      ServletException, IOException {
    String data="clevermis";
    PrintWriter print=response.getWriter();
    print.write(data);
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws
      ServletException, IOException {
    doGet(request,response);
  }

}

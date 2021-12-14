package com.clevermis;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Description TODO
 * @Classname HelloWorldServlet
 * @Date 2021/12/11 下午5:30
 * @Created by clevermis
 */
public class HelloWorldServlet  extends GenericServlet {

  @Override
  public void service(ServletRequest servletRequest, ServletResponse servletResponse)
      throws ServletException, IOException {
    PrintWriter writer = servletResponse.getWriter();
    writer.println("Hello World");

  }
}
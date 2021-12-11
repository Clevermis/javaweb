package com.clevermis;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Description TODO
 * @Classname HelloWorldServlet02
 * @Date 2021/12/11 下午5:39
 * @Created by clevermis
 */
public class HelloWorldServlet02  extends GenericServlet {


  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("init");
  }

  @Override
  public void service(ServletRequest servletRequest, ServletResponse servletResponse)
      throws ServletException, IOException {
    System.out.println("hello world");
  }


  @Override
  public void destroy() {
    System.out.println("destory");
  }
}

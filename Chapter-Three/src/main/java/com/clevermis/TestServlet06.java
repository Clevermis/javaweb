package com.clevermis;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname TestServlet06
 * @Date 2021/12/12 下午2:26
 * @Created by clevermis
 */
public class TestServlet06 extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    ServletContext context = this.getServletContext();
    PrintWriter out = response.getWriter();
    InputStream in = context
        .getResourceAsStream("/WEB-INF/classes/itcast.properties");
    Properties pros = new Properties();
    pros.load(in);
    out.println("Company=" + pros.getProperty("Company") + "<br>");
    out.println("Address=" + pros.getProperty("Address") + "<br>");
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doGet(request, response);
  }
}
package com.clevermis;

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname PrintServlet
 * @Date 2021/12/12 下午3:09
 * @Created by clevermis
 */
public class PrintServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws
      ServletException, IOException {
    String data="clevermis";
    OutputStream out=response.getOutputStream();// 获取输出流对象
    out.write(data.getBytes());                     // 输出字符串信息
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws
      ServletException, IOException {
    doGet(request,response);
  }
}

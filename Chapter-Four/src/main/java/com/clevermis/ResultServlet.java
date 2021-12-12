package com.clevermis;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname ResultServlet
 * @Date 2021/12/12 下午4:05
 * @Created by clevermis
 */
public class ResultServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();// 获取PrintWriter对象用于输出信息
    // 获取request请求对象中保存的数据
    String company = (String) request.getAttribute("company");
    if (company != null) {
      out.println("公司名称：" + company + "<br>");
    }
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
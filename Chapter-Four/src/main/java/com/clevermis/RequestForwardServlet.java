package com.clevermis;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname RequestForwardServlet
 * @Date 2021/12/12 下午4:01
 * @Created by clevermis
 */
public class RequestForwardServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html;charset=utf-8");
    // 将数据存储到request对象中
    request.setAttribute("company", "北京传智播客教育有限公司");
    RequestDispatcher dispatcher = request
        .getRequestDispatcher("/ResultServlet");
    dispatcher.forward(request, response);
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}

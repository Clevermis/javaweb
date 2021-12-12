package com.clevermis;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname RequestParamsServlet
 * @Date 2021/12/12 下午3:55
 * @Created by clevermis
 */
public class RequestParamsServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String name = request.getParameter("username");
    String password = request.getParameter("password");
    System.out.println("用户名:" + name);
    System.out.println("密  码:" + password);
    // 获取参数名为“hobby”的值
    String[] hobbys = request.getParameterValues("hobby");
    System.out.print("爱好:");
    for (int i = 0; i < hobbys.length; i++) {
      System.out.println(hobbys[i]+" ");
    }
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}

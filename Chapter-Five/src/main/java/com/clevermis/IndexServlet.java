package com.clevermis;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description TODO
 * @Classname IndexServlet
 * @Date 2021/12/12 下午5:00
 * @Created by clevermis
 */
public class IndexServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // 解决乱码问题
    response.setContentType("text/html;charset=utf-8");
    // 创建或者获取保存用户信息的Session对象
    HttpSession session = request.getSession();
    User user = (User) session.getAttribute("user");
    if (user == null) {
      response.getWriter().print(
          "您还没有登录，请<a href='/chapter06/Login.html'>登录</a>");
    } else {
      response.getWriter().print("您已登录，欢迎你，" + user.getUsername() + "！");
      response.getWriter().print(
          "<a href='/chapter06/LogoutServlet'>退出</a>");
      // 创建Cookie存放Session的标识号
      Cookie cookie = new Cookie("JSESSIONID", session.getId());
      cookie.setMaxAge(60 * 30);
      cookie.setPath("/chapter06");
      response.addCookie(cookie);
    }
  }
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
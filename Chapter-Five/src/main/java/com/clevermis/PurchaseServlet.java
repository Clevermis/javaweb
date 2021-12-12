package com.clevermis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description TODO
 * @Classname PurchaseServlet
 * @Date 2021/12/12 下午4:45
 * @Created by clevermis
 */
public class PurchaseServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    // 获得用户购买的商品
    String id = req.getParameter("id");
    if (id == null) {
      // 如果id为null，重定向到ListBookServlet页面
      String url = "/chapter06/ListBookServlet";
      resp.sendRedirect(url);
      return;
    }
    Book book = BookDB.getBook(id);
    // 创建或者获得用户的Session对象
    HttpSession session = req.getSession();
    // 从Session对象中获得用户的购物车
    List<Book> cart = (List) session.getAttribute("cart");
    if (cart == null) {
      // 首次购买，为用户创建一个购物车(List集合模拟购物车)
      cart = new ArrayList<Book>();
      // 将购物城存入Session对象
      session.setAttribute("cart", cart);
    }
    // 将商品放入购物车
    cart.add(book);
    // 创建Cookie存放Session的标识号
    Cookie cookie = new Cookie("JSESSIONID", session.getId());
    cookie.setMaxAge(60 * 30);
    cookie.setPath("/chapter06");
    resp.addCookie(cookie);
    // 重定向到购物车页面
    String url = "/chapter06/CartServlet";
    resp.sendRedirect(url);
  }
}
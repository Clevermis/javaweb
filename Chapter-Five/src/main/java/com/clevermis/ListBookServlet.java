package com.clevermis;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Classname ListBookServlet
 * @Date 2021/12/12 下午4:43
 * @Created by clevermis
 */
public class ListBookServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/html;charset=utf-8");
    PrintWriter out = resp.getWriter();
    Collection<Book> books = BookDB.getAll();
    out.write("本站提供的图书有：<br>");
    for (Book book : books) {
      String url = "/chapter06/PurchaseServlet?id=" + book.getId();
      out.write(book.getName() + "<a href='" + url
          + "'>点击购买</a><br>");
    }
  }
}
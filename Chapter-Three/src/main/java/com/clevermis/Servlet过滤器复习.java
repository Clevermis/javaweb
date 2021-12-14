package com.clevermis;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Description TODO
 * @Classname Servlet过滤器复习
 * @Date 2021/12/14 上午4:08
 * @Created by clevermis
 */
public class Servlet过滤器复习 implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {


  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {

    //放行     这句话注意下就行，其他的跟servlet没区别
    filterChain.doFilter(servletRequest, servletResponse);

  }

  @Override
  public void destroy() {

  }
}

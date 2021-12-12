package com.clevermis;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description TODO
 * @Classname Book
 * @Date 2021/12/12 下午4:37
 * @Created by clevermis
 */
@Getter
@Setter
public class Book implements Serializable {
  private static final long serialVersionUID = 1L;
  private String id;
  private String name;
  public Book() {
  }
  public Book(String id, String name) {
    this.id = id;
    this.name = name;
  }
}
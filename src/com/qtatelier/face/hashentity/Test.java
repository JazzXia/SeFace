package com.qtatelier.face.hashentity;

/**
 * 主要用于HashMap的实体类
 * 未重写hashCode和equals
 */
public class Test {
  private int code;
  private String name;

  public Test() {
  }

  public Test(int code, String name) {
    this.code = code;
    this.name = name;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Test{" +
            "code=" + code +
            ", name='" + name + '\'' +
            '}';
  }
}

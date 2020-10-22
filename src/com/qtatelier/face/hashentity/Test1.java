package com.qtatelier.face.hashentity;

import java.util.Objects;

/**
 * 主要用于HashMap的实体类
 * 未重写hashCode和equals
 */
public class Test1
{
  private int code;
  private String name;

  public Test1() {
  }

  public Test1(int code, String name) {
    this.code = code;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Test1 test1 = (Test1) o;
    return code == test1.code &&
            Objects.equals(name, test1.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
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

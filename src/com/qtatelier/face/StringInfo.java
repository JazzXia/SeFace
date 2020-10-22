package com.qtatelier.face;

/**
 * new 是在堆内存中额外开辟出来的空间
 * == 是比较内存地址并不是值
 * equals比较的是值
 */
public class StringInfo {
  public static void main(String[] args) {
    String a = "abc";
    String b = "abc";
    String c = new String("abc");
    String d = "ab" + "c";
    System.out.println(a.equalsIgnoreCase(c));

    System.out.println("a == b " + (a == b));
    //true
    System.out.println("a == c " + (a == c));
    //false
    System.out.println("a == d " + (a == d));
    //true
    System.out.println("b == c " + (b == c));
    //false
    System.out.println("b == d " + (b == d));
    //true
    System.out.println("c == d " + (c == d));
    //false

    //看到此处，了解了hashcode其实类似于一个坐标(可以将之总结成物理地址(并不是))每个对象的生成的hash值指向了一个物理地址,这样，如果生成的hash相同，就到对应的物理地址去比较两个值是否相等
    //如果hash不一样就在新的地方开辟一个物理地址。
    //hash值相同，用equals比较时不代表两个结果相同。hash值不同用equals比较时两个结果一定不同
    //equals比较时为true,hash一定相同，如果为false，hash不一定不同.
    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
    System.out.println(c.hashCode());
  }
}

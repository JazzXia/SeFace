package com.qtatelier.face;

import com.qtatelier.face.hashentity.Test;
import com.qtatelier.face.hashentity.Test1;

import java.util.*;

/**
 * 主要用于总结hashmap的所有信息
 */
public class HashMapInfo
{
  public static void main(String[] args) {
    //1.什么情况下，需要重写hashCode和equals
    //这种情况下，我们并未对其进行重写，那么所得结果如下
    HashSet hashSet = new HashSet();
    hashSet.add(new Test(1, "aa"));
    hashSet.add(new Test(1, "aa"));
    //[Test{code=1, name='aa'}, Test{code=1, name='aa'}]明明HashSet是不允许重复的，但在此处却重复了,原因是此处直接用equals比较，比较的是地址的值。由于是两个新对象地址必定不同
    System.out.println(hashSet);

    HashMap<Object, Integer> hashMap = new HashMap<>();
    hashMap.put(new Test(1, "aa"), 1);
    hashMap.put(new Test(1, "aa"), 1);
    //{Test{code=1, name='aa'}=1, Test{code=1, name='aa'}=1}
    System.out.println(hashMap);

    //如果重写的情况下,由于重写了所以只有一个结果
    HashSet hashSet1 = new HashSet();
    hashSet1.add(new Test1(1, "aa"));
    hashSet1.add(new Test1(1, "aa"));
    //[Test{code=1, name='aa'}]
    System.out.println(hashSet1);

    HashMap<Object, Integer> hashMap2 = new HashMap<>();
    hashMap2.put(new Test1(1, "aa"), 1);
    hashMap2.put(new Test1(1, "aa"), 1);
    //{Test{code=1, name='aa'}=1}
    System.out.println(hashMap2);

    //2.集合分为Map和Collection
    //其中Collection接口被List接口,Set接口,Queue接口继承，Map被AbstractMap实现,被SortedMap接口继承
    //AbstractList 继承了AbstractCollection并且实现了List接口同时被Vector,ArrayList,AbstractSequentialList继承
    //而AbstractSequentialList又被LinkedList继承
    //所以集合有Collection和Map
    //Collection中有List和Set,
    // 其中List又分为ArrayList,LinkedList,Vector
    // 其中Set中又分为HashSet,LinkedHashSet,TreeSet
    //Map又有如下的Map，HashMap,LinkedHashMap,IdentityHashMap,HashTable,WeakHashMap

    //3.

    //4.




  }


}

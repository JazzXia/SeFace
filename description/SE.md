1.``String a="123"; String b="123";String c = new String("abc"); a,b,c的关系``
    
    答：a==b true a==c b==c false
 `` new 是在堆内存中额外开辟出来的空间,== 是比较内存地址并不是值,equals比较的是值,而equals而言，如果没重写，用equals比较本质上还是==，如果重写之后比较的是用新的equals进行比较
 。针对==，如果两边是数据类型变量直接比较值，如果两边是引用类型变量那么比较的就是两者之间的地址值。``

2.

3.
4.
5.
6.
7.
8.
9.
10.
11.
12.
13.
14.
15.
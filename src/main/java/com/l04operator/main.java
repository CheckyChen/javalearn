package com.l04operator;

public class main {
    public static void main(String[] args) {

        int a = 1, b = 2, c;
        System.out.println("a=1,b=2");
        c = a + b;
        System.out.println("a+b=" + c);

        c = a * b;
        System.out.println("a*b=" + c);

        c = b / a;
        System.out.println("b/a=" + c);

        c = a - b;
        System.out.println("a-b=" + c);

        int d = 2;
        d += 2;
        System.out.println("d=2,d+=2=" + d);

        int e = 3;
        e -= 1;
        System.out.println("e=3,3-=1=" + e);

        int f = 3;
        System.out.println("f=3,f++=" + f++); // 3 ，先使用 f 再 +1 操作
        System.out.println("f=" + f); // 4

        int g = 4;
        System.out.println("g=4,++g=" + (++g)); // 5 ，先 +1 操作，再使用 g

        int h = 5 % 5; // 取余操作
        System.out.println("5%3=" + h);

        System.out.println("a==b " + (a == b));
        System.out.println("a!=b " + (a != b));
        System.out.println("a>b " + (a > b));
        System.out.println("a<b " + (a < b));
        System.out.println("a<=b " + (a <= b));
        System.out.println("a>=b " + (a >= b));

        // 与或非 运算符
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 || b2  " + (b1 || b2));
        System.out.println("!(b1 && b2) " + !(b1 && b2));

        // 逻辑 运算符  ?:
        System.out.println("a>b?'a大':'a小' => " + (a > b ? "a大" : "a小"));

        // instanceof 运算符
        String str = "checkychen";
        System.out.println("str instanceof String = " + (str instanceof String));//该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。
    }
}

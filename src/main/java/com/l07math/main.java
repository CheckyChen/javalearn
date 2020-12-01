package com.l07math;

public class main {
    public static void main(String[] args) {

        float f = 2.56f;
        System.out.println("f=2.56f,Math.round(f) = " + Math.round(f));

        for (int i = 0; i < 100; i++) {
            double random = Math.random(); // 产生小于 （0，1） 的随机数
            System.out.println(random);
        }

        // 类型转化
        int i = Integer.parseInt("2222");
        System.out.println(i);
    }
}

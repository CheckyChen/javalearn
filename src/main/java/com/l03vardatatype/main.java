package com.l03vardatatype;

public class main {
    public static void main(String[] args) {
        byte by = 0;
        byte b1, b2, b3;

        printData(by);

        short sht = 0;
        printData(sht);

        int i = 0;
        int i1 = 1, i2 = 2, i3 = 3;
        printData(i);

        long l = 10000;
        printData(l);

        float f = 1.1f; // 必须加上f的标识
        printData(f);

        double d = 2.2;
        printData(d);

        char c = 'a';
        printData(c);

        String s = "this is a string type";
        printData(s);

        boolean b = false;
        printData(b);

        int f2int = (int) f;
        printData(f2int); // 1
    }

    static void printData(Object o) {
        System.out.println(o);
    }
}

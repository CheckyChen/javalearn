package com.l05loopstruct;

public class main {
    public static void main(String[] args) {

        // while 循环
        System.out.println("----------while--------");
        int times = 0;
        int max = 5;
        while (times <= max) {
            System.out.println(times);
            times++;
        }

        // do...while 循环
        System.out.println("----------do...while--------");
        times = 0;
        do {
            System.out.println(times);
            times++;
        } while (times <= max);

        // for 循环
        System.out.println("----------for--------");
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }

        // for( : )
        int[] ints = {10, 20, 30, 40, 50, 60, 80, 100};
        System.out.println("----------for( : )--------");
        for (int i : ints) {
            System.out.println(i);
        }

        // break
        System.out.println("----------break--------");
        for (int i = 0; i <= max; i++) {
            if (i > 3) break;
            System.out.println(i);
        }

        // continue
        System.out.println("----------continue--------");
        for (int i = 0; i <= max; i++) {
            if (i == 3) continue;
            System.out.println(i);
        }

    }
}

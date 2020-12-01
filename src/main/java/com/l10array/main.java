package com.l10array;

public class main {
    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 99};
        int[] ints1 = new int[100];

        for (int i = 0; i < ints1.length; i++) {
            ints1[i] = i;
        }

        for (int i : ints1) {
            System.out.println(i);
        }

        String[] strings = {"a", "b", "c"};

        float[] floats = {1.2f, 3.4f, 5.5f};

        int[][] ints2 = new int[3][2];
        ints2[0][0]=1;
        ints2[0][0]=2;
        ints2[1][0]=3;
        ints2[1][1]=4;

        System.out.println(ints2[0].length);
    }
}

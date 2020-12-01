package com.l06ifelseswitch;

public class main {
    public static void main(String[] args) {

        System.out.println("---------switch---------");
        int a = 0;
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("其他");
        }

        System.out.println("---------if else ---------");
        int b = 1;
        int c = 2;

        if (b > c) {
            System.out.println("b>c");
        } else if (b == c) {
            System.out.println("b==c");
        } else {
            System.out.println("b<c");
        }

    }
}

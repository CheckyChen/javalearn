package com.l15scanner;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //nextTypeInput();
        nextLineType();
    }

    /**
     * next方式接收屏幕输入，接收空格前的字符串，空格后的字符串，自动去掉
     */
    static void nextTypeInput() {

        Scanner scanner = new Scanner(System.in);
        // 这种方式接受的字符，第一个空格后的字符串都不会记录进来
        System.out.print("next方式接受输入：");
        if (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println(str);
        }
        scanner.close();
    }

    /**
     * nextLine方式接收屏幕输入
     */
    static void nextLineType() {

        Scanner s = new Scanner(System.in);
        System.out.print("nextLine方式接受输入：");
        if (s.hasNextLine()) {
            String content = s.nextLine();
            System.out.println(content);
        }
        s.close();
    }

}

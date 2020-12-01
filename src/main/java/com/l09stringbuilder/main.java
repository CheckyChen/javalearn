package com.l09stringbuilder;

public class main {
    public static void main(String[] args) {

        // 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
        StringBuilder sb = new StringBuilder("这是一个可变长的字符串");
        sb.append(",添加了一段文字。");

        System.out.println(sb);
        System.out.println(sb.capacity());// 容量 27
        System.out.println(sb.length());// 长度 20

        sb.append("，又添加了一段文字。");
        System.out.println(sb.capacity()); // 56 容量会根据添加增多而增多

        // StringBuffer 是线程安全的，StringBuilder 不是线程安全的，要求线程安全的话，必须使用 StringBuffer
        // StringBuffer 比 StringBuilder 性能慢
        StringBuffer sbf = new StringBuffer("hello");
        sbf.append(" world.");

    }
}

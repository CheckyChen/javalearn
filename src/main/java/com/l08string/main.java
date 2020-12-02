package com.l08string;

public class main {

    public static void main(String[] args) {

        String s = new String(new char[]{'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a'});
        System.out.println(s);

        String s1 = "this";
        String s2 = "is";
        String s3 = "string";

        System.out.println(s3.toUpperCase());// STRING
        System.out.println(s1 + " " + s2 + " " + s3);

        String s4 = String.format("this is a float %f,string %s", 1.22, "字符串");
        System.out.println(s4);

        String s5 = "this is a fake long string.";
        System.out.println(s5.charAt(1));
        System.out.println(s5.compareTo("this is a factory long string.")); // =0,字符串相等，<0,s5排在前面，否则s5排在后面
        System.out.println(s5.compareToIgnoreCase("this is a fake long STRING."));// 忽略大小写比较两个字符串

        System.out.println("a".equals("a"));// true
        System.out.println("A".equalsIgnoreCase("a"));//true

        String s6 = new String("a");
        String s7 = new String("a");
        System.out.println(s6.equals(s7));// true
        System.out.println(s6 == s7); // false ***************注意这里***************

        String s8 = "apple is fruit";
        System.out.println(s8.substring(2));// ple is fruit
        System.out.println(s8.substring(2, 7));// ple i , 从索引为2开始，截取到第 7-1 位

        System.out.println(s8.contains("apple")); // true
        System.out.println(s8.length()); // 14
        // System.out.println(s8.isEmpty()); // false
        System.out.println(s8.replace("apple", "banana"));

        String[] strings = s8.split(" ");
        for (String item : strings) {
            System.out.println(item);
        }

        String s9 = " 前后有空白部分。 ";
        System.out.println(s9 + ",trim()前的长度：" + s9.length());
        String s10 = s9.trim();
        System.out.println(s10 + "，trim()后的长度：" + s10.length());// 将前后的空白部分给移除了
    }
}

package com.l12regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    public static void main(String[] args) {

        String content = "我爱中华人民共和国。";
        String pattern = ".*中华.*";
        boolean isMatched = Pattern.matches(pattern, content);
        System.out.println("is matched:" + isMatched);


        String line = "这个订单是QT3000！好吗？";
        // \\D* 匹配非数字，\\d+ 匹配多个数字， .* 匹配所有字符
        String p1 = "(\\D*)(\\d+)(.*)";
        Pattern r1 = Pattern.compile(p1);
        Matcher matcher = r1.matcher(line);
        if (matcher.find()) {
            System.out.println(matcher.group(0));// 匹配的原字符串
            System.out.println(matcher.group(1));// 这个订单是QT
            System.out.println(matcher.group(2));// 3000
            System.out.println(matcher.group(3));// ！好吗？
        }

        String line1 = "这个订单是QT3000,不是QT1000！好吗？";
        String p2 = "\\d+";
        Pattern r2 = Pattern.compile(p2);
        Matcher m2 = r2.matcher(line1);
        if (m2.find()) {
            // 将所有的数字替换为 5000
            String ret = m2.replaceAll("5000");
            System.out.println(ret); // 这个订单是QT5000！好吗？
        } else {
            System.out.println("没找到数字！");
        }

        String line2 = "cat cat caty cat";
        String r3 = "\\bcat\\b";
        Pattern p3 = Pattern.compile(r3);
        Matcher m3 = p3.matcher(line2);

        int count = 0;// 统计匹配到的次数
        while (m3.find()) {
            count++;
            System.out.println(count + " => Start: " + m3.start() + " - End: " + m3.end());
        }

    }
}

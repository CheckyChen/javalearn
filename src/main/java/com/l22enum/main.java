package com.l22enum;

public class main {

    public static void main(String[] args) {

        Color c = Color.Blue;
        System.out.println(c.getClass() + " - " + c);
        System.out.println(c.toString().getClass() + " - " + c.toString());

        for (Color value : Color.values()) {
            System.out.println(value + " - " + value.ordinal()); // ordinal() 获取枚举索引
        }
    }

    enum Color {
        Red,
        Blue,
        Yellow
    }
}

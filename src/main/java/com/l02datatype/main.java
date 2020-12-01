package com.l02datatype;

public class main {
    public static void main(String[] args) {
        dataDetails();
    }

    static void dataDetails() {
        // byte
        System.out.println("byte size:" + Byte.SIZE);
        System.out.println("byte max_value:" + Byte.MAX_VALUE);
        System.out.println("byte min_value:" + Byte.MIN_VALUE);
        System.out.println();
        // short
        System.out.println("short size:" + Short.SIZE);
        System.out.println("short max_value:" + Short.MAX_VALUE);
        System.out.println("short min_value:" + Short.MIN_VALUE);
        System.out.println();
        // int
        System.out.println("int size:" + Integer.SIZE);
        System.out.println("int max_value:" + Integer.MAX_VALUE);
        System.out.println("int min_value:" + Integer.MIN_VALUE);
        System.out.println();
        // long
        System.out.println("long size:" + Long.SIZE);
        System.out.println("long max_value:" + Long.MAX_VALUE);
        System.out.println("long min_value:" + Long.MIN_VALUE);
        System.out.println();
        // double
        System.out.println("double size:" + Double.SIZE);
        System.out.println("double max_value:" + Double.MAX_VALUE);
        System.out.println("double min_value:" + Double.MIN_VALUE);
        System.out.println();
        // float
        System.out.println("float size:" + Float.SIZE);
        System.out.println("float max_value:" + Float.MAX_VALUE);
        System.out.println("float min_value:" + Float.MIN_VALUE);
        System.out.println();
        // char
        System.out.println("char size:" + Character.SIZE);
        System.out.println("char max_value:" + (int)Character.MAX_VALUE);
        System.out.println("char min_value:" + (int)Character.MIN_VALUE);
        System.out.println();
    }
}

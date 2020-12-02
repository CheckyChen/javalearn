package com.l21interface;

public class Dog implements Runnable, Swimable {

    public void run() {
        System.out.println("Dog is running...");
    }

    public void swim() {
        System.out.println("Dog is swimming...");
    }
}

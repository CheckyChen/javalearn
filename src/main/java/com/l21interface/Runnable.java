package com.l21interface;

public interface Runnable {

    public void run();

    // 报错：Interface abstract methods cannot have body
    // public void eat(){
    //  System.out.println("eating");
    // }
}

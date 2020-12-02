package com.l18overrideoverload;

public class Dog extends Animal {

    // 如果和父类的方法签名不一致，则是重载父类的方法
    public void eat(String dog) {
        System.out.println("dog eating...");
    }

    /**
     * 和父类的方法签名一致的话，默认就重写了父类的方法
     */
    public void run() {
        System.out.println("dog running...");
    }

    // 如果想调用父类的方法，用 super 关键字
    public void eatBySuper() {
        super.eat();
    }
}

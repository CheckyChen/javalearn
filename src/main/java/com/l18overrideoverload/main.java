package com.l18overrideoverload;

public class main {


    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.eat();
        d.eat("dog");
    }
}

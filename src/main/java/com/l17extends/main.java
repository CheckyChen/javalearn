package com.l17extends;

public class main {


    public static void main(String[] args) {

        Animal a = new Animal("动物", 5);
        int age = a.getAge();
        System.out.println(a.getClass() + ": " + age);  // class com.l17extends.Animal: 5 **********
        System.out.println(a instanceof Animal); // true

        Dog d = new Dog("大狗子", 6);
        age = d.getAge();
        System.out.println(a.getClass() + ": " +age); // class com.l17extends.Animal: 6 *************
        System.out.println(a instanceof Dog); // false
    }
}




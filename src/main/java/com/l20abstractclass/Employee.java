package com.l20abstractclass;

public abstract class Employee {

    private String name;
    private int age;
    public long salary = 10000;

    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        System.out.println(name);
        return name;
    }

    public int getAge(){
        System.out.println(age);
        return age;
    }

    public abstract long computeSalary();
}

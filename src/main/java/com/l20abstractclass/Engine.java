package com.l20abstractclass;

public class Engine extends Employee {

    public Engine(String name, int age) {
        super(name, age);
    }

    // 必须得重写抽象类中的抽象方法
    public long computeSalary() {
        System.out.println(salary);
        return salary;
    }
}

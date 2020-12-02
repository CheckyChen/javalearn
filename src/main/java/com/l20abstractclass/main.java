package com.l20abstractclass;

public class main {

    public static void main(String[] args) {

        Employee e = new Engine("France",22);
        long salary = e.computeSalary();
        int age = e.getAge();

        // 不能被实例化，报错
        // Employee e1 = new Employee();
    }
}

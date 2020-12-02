package com.l13method;

public class main {

    public static void main(String[] args) {

        long[] longs = {4,5,6};
        getNumbers(1, 2, 3);
        getNumbers(longs);

        getPerson("checky");
        getPerson("checky", 29);
    }

    /**
     * 可变参数函数
     *
     * @param numbers 1,2,3 or array: {4,5,6}
     */
    static void getNumbers(long... numbers) {

        if (numbers.length == 0) {
            System.out.println("没有传入数字！");
        } else {
            for (long i : numbers) {
                System.out.println(i);
            }
        }
    }

    // 如果想要实现默认形参的值，可以通过函数的重载实现

    static void getPerson(String name, int age) {
        System.out.println("name: " + name + " age: " + age);
    }

    static void getPerson(String name) {
        System.out.println("name: " + name + " age: 22");
    }
}

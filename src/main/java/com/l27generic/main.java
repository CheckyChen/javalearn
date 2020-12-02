package com.l27generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Integer[] ints = {1, 2, 3, 4, 5, 6, 7};
        printList(ints);

        String[] strings = {"a", "b", "c", "d"};
        printList(strings);

        List<String> list = new ArrayList<>();
        list.add("a");
        getFirstData(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        getFirstData(list1);

        System.out.println("-----泛型类------");
        Box<Integer> box1 = new Box<>();
        box1.setE(1);
        box1.getE();

        Box<String> box2 = new Box<>();
        box2.setE("grace");
        box2.getE();
    }

    // 泛型方法
    static <E> void printList(E[] arr) {
        System.out.println("--------");
        for (E e : arr) {
            System.out.println(e.toString());
        }
    }

    // 类型通配符 *****************
    static void getFirstData(List<?> list) {
        // 获取集合的第一个元素
        System.out.println(list.get(0));
    }

}

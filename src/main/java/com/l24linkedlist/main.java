package com.l24linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class main {


    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<String>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        printLinkedList(colors);

        colors.addFirst("orange");
        printLinkedList(colors);

        colors.addLast("red");
        printLinkedList(colors);

        String c = colors.get(0);
        System.out.println("0 index element: " + c);

        // 设置第二个元素为 black
        colors.set(1, "black");
        printLinkedList(colors);

        // 删除并返回第一个元素
        String e = colors.remove();
        System.out.println("remove: " + e);

        String[] arr = {"a", "b", "c", "d"};
        LinkedList<String> list = new LinkedList<String>();
        list.addAll(Arrays.asList(arr));
        printLinkedList(list);

        int size = list.size();
        System.out.println("list size = " + size);
        list.clear();
        size = list.size();
        System.out.println("after clear() ,list size = " + size);
    }

    static void printLinkedList(LinkedList<String> list) {
        System.out.println("------------");
        list.forEach(a -> System.out.println(a));
    }
}

package com.l23arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class main {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("baidu");
        list1.add("jd");
        list1.add("tencent");
        list1.add("alibaba");
        printList(list1);

        list1.set(0, "meituan");
        printList(list1);

        list1.remove(0);
        printList(list1);

        int size = list1.size();
        System.out.println("size = " + size);

        // 移除集合中字符串长度大于8的元素
        list1.removeIf(a -> a.length() > 2);
        printList(list1);

        list1.clear();
        size = list1.size();
        System.out.println("size = " + size);

        String[] strings = {"f", "a", "b", "c"};
        list1.addAll(Arrays.asList(strings.clone()));
        printList(list1);

        // 循环集合
        list1.forEach(a -> System.out.println(a));

        // 升序
        list1.sort(Comparator.naturalOrder());
        printList(list1);

        // 降序
        list1.sort(Comparator.reverseOrder());
        printList(list1);


        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("add");
        list2.add("increase");
        list2.add("sub");
        // 按照字符长度倒序排 ********************
        list2.sort((o1, o2) -> o2.length() > o1.length() ? 1 : -1);
        printList(list2);
    }

    static void printList(ArrayList<String> list) {
        System.out.println("-----------------");
        for (String item : list)
            System.out.println(item + " ");
    }
}

package com.l26iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");

        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println("value: " + it.next());

    }
}

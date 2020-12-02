package com.l25hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map.forEach((key, value) -> {
            System.out.println(String.format("key: %s,value: %s", key, value));
        });

        // 返回所以的 value 集合
        Collection<String> values = map.values();
        values.forEach(a -> System.out.println(a));

        // 返回所有的 key 集合
        Set<Integer> keys = map.keySet();
        keys.forEach(a -> System.out.println(a));

        printHashMap(map);
        map.remove(1);
        printHashMap(map);

        int size = map.size();
        System.out.println("size = " + size);

        map.clear();
        size = map.size();
        System.out.println("after clear(), size = " + size);

        // 如果hashmap中不存在 6, 则插入该键值对
        map.putIfAbsent(6, "six");
        map.putIfAbsent(6,"666"); // 这个就不会插入了
        printHashMap(map);
    }

    static void printHashMap(HashMap<Integer, String> map) {
        System.out.println("----------");
        map.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}

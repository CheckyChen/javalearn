package com.l28serialize;

import com.alibaba.fastjson.*;
import cn.hutool.json.JSONUtil;

import java.lang.reflect.Type;


public class main {

    public static void main(String[] args) {

        Person p = new Person();
        p.name = "France";
        p.age = 22;
        String json = JSON.toJSONString(p);
        System.out.println(json);

        String pp = "{\"age\":29,\"name\":\"Grace\"}";
        Person p1 = JSON.parseObject(pp, Person.class);
        System.out.println(p1.name);
        System.out.println(p1.age);

        p1.name = "Allen";
        p1.age = 30;
        String pp2 = JSONUtil.toJsonStr(p1);
        System.out.println(pp2);

        Person p2 = JSONUtil.toBean(pp2, Person.class);
        System.out.println(p2.name);
        System.out.println(p2.age);

        String[] strArr = {"a", "b", "c"};
        String s = JSONUtil.toJsonStr(strArr);
        System.out.println(s);

        Type type = String[].class.getGenericSuperclass();
        cn.hutool.json.JSONArray arr2 = JSONUtil.parseArray(s);

        for (Object i : arr2) {
            System.out.println(i.toString());
        }
    }
}

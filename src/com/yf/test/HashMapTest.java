package com.yf.test;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args){
        HashMap<String, String> hs = new HashMap();
        hs.put("num1", "value1");
        hs.put("num2", "value2");
        hs.put("num3", "value3");

        hs.put("num2", "value10");

        System.out.println(hs.get("num2"));
        hs.remove("num2");
        System.out.println(hs.get("num2"));
    }
}

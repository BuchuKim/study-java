package org.example.map.hashcode;

import java.util.HashMap;

public class HashCodeEx {
    public static void main(String[] args) {
        HashMap<MyKey,Integer> hashMap = new HashMap<>();

        MyKey myKey = new MyKey();

        System.out.println("put() 호출");
        hashMap.put(myKey,1);

        System.out.println("get() 호출");
        hashMap.get(myKey);
    }
}

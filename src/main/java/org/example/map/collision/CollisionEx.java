package org.example.map.collision;

import java.util.HashMap;

public class CollisionEx {
    public static void main(String[] args) {
        CollisionKey key1 = new CollisionKey(10);
        CollisionKey key2 = new CollisionKey(10);

        HashMap<CollisionKey,Integer> hashMap = new HashMap<>();
        hashMap.put(key1,1);
        hashMap.put(key2,1);
        System.out.println();

        System.out.println(hashMap.get(key2));

    }
}

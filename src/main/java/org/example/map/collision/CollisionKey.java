package org.example.map.collision;

public class CollisionKey {
    private final int key;

    public CollisionKey(int key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() 호출");
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() 호출");
        return key;
    }
}

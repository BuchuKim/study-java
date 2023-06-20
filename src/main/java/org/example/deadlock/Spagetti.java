package org.example.deadlock;

public class Spagetti {
    String name;
    Spagetti(String name) {
        this.name = name;
    }
    void eaten() {
        System.out.println(name + " 먹힘");
    }
}

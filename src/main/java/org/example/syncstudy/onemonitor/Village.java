package org.example.syncstudy.onemonitor;

public class Village {
    int money;
    String name;

    public Village(String name) {
        this.name = name;
    }

    public void addMoney() {
        synchronized (this) {
            money++;
        }
    }
}

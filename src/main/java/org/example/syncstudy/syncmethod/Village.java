package org.example.syncstudy.syncmethod;

public class Village {
    int money;

    public synchronized void addMoney() {
        money++;
    }
}

package org.example.syncstudy.syncblock;

public class Village {
    int money;

    public void addMoney() {
        synchronized (this) {
            money++;
        }
    }
}

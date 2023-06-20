package org.example.deadlock;

public class Fork {
    synchronized void picked() throws InterruptedException {
        wait();
    }

    synchronized void putDowned() {
        notify();
    }
}

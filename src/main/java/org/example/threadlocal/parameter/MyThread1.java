package org.example.threadlocal.parameter;

import lombok.Getter;

@Getter
public class MyThread1 extends Thread {
    private final int value;

    public MyThread1(int value) {
        this.value = value;
    }
    @Override
    public void run() {
        System.out.println(this.getName() + "'s value is " + value);
    }
}

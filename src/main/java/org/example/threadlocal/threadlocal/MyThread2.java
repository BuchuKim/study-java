package org.example.threadlocal.threadlocal;

import org.example.threadlocal.RandomNumber;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        RandomNumber.setRandomNumber();
        System.out.println(this.getName() + "'s value is " + RandomNumber.threadLocal.get());
    }
}

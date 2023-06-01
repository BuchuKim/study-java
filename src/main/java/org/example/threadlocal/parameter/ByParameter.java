package org.example.threadlocal.parameter;

import org.example.threadlocal.RandomNumber;

public class ByParameter {
    public static void main(String[] args) {
        MyThread1 thread0 = new MyThread1(RandomNumber.generateRandomNumber());
        MyThread1 thread1 = new MyThread1(RandomNumber.generateRandomNumber());

        thread0.start();
        thread1.start();
    }
}

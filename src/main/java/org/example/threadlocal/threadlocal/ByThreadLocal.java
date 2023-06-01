package org.example.threadlocal.threadlocal;

public class ByThreadLocal {
    public static void main(String[] args) {
        MyThread2 thread0 = new MyThread2();
        MyThread2 thread1 = new MyThread2();

        thread0.start();
        thread1.start();
    }
}

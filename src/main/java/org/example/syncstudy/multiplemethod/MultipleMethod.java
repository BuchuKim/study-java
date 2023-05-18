package org.example.syncstudy.multiplemethod;

import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class MultipleMethod {
    public static void main(String[] args) throws InterruptedException {
        MultipleMethod multipleMethod = new MultipleMethod();
        Thread thread1 = new Thread(() -> {
            multipleMethod.method1("thread1");
        });
        Thread thread2 = new Thread(() -> {
            multipleMethod.method2("thread2");
        });

        thread1.start();
        thread2.start();

        sleep(100);
        System.out.println("thread1 상태 : " + thread1.getState());
        System.out.println("thread2 상태 : " + thread2.getState());
    }

    private synchronized void method1(String name) {
        System.out.println(name + " method1 시작 : " + LocalDateTime.now());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " method1 종료 : " + LocalDateTime.now());
    }

    private synchronized void method2(String name) {
        System.out.println(name + " method2 시작 : " + LocalDateTime.now());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " method2 종료 : " + LocalDateTime.now());
    }
}

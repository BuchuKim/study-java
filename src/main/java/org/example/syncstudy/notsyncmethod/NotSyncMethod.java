package org.example.syncstudy.notsyncmethod;

import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class NotSyncMethod {
    public static void main(String[] args) {
        NotSyncMethod notSyncMethod = new NotSyncMethod();
        Thread thread1 = new Thread(() -> {
            notSyncMethod.method1("thread1");
        });
        Thread thread2 = new Thread(() -> {
            notSyncMethod.method2("thread2");
        });
        Thread thread3 = new Thread(() -> {
            notSyncMethod.method3("thread3");
        });

        thread1.start();
        thread2.start();
        thread3.start();

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

    private void method3(String name) {
        System.out.println(name + " method3 시작 : " + LocalDateTime.now());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " method3 종료 : " + LocalDateTime.now());
    }
}

package org.example.syncstudy.staticsync;

import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class StaticSync {
    public static void main(String[] args) throws InterruptedException {
        StaticSync staticSync = new StaticSync();

        Thread thread1 = new Thread(() -> {
            staticSyncMethod("thread1");
        });
        Thread thread2 = new Thread(() -> {
            staticSyncMethod("thread2");
        });
        Thread thread3 = new Thread(() -> {
            staticSync.normalSyncMethod("thread3");
        });
        Thread thread4 = new Thread(() -> {
            staticSync.normalSyncMethod("thread4");
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    private static synchronized void staticSyncMethod(String name) {
        System.out.println(name + " static method 시작 : " + LocalDateTime.now());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " static method 종료 : " + LocalDateTime.now());
    }

    private synchronized void normalSyncMethod(String name) {
        System.out.println(name + " normal method 시작 : " + LocalDateTime.now());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " normal method 종료 : " + LocalDateTime.now());
    }
}

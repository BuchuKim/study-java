package org.example.threadlocal.caution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ByThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i=0; i<10; i++) {
            service.submit(new MyThread());
        }

        service.shutdown();
    }
}

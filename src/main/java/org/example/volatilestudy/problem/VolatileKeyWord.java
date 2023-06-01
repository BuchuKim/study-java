package org.example.volatilestudy.problem;

public class VolatileKeyWord {
    static volatile boolean go = false;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!go); // wait until go = true
            System.out.println("thread terminated");
        });

        thread.start();
        Thread.sleep(1000);
        go = true;
        System.out.println("main thread terminated.");
    }
}

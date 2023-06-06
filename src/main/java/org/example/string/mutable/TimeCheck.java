package org.example.string.mutable;

public class TimeCheck {
    private static long start;
    private static long end;

    public static void start() {
        start = System.nanoTime();
    }

    public static void end() {
        end = System.nanoTime();
    }

    public static void printTime() {
        double time = (end - start) / (double) 1_000_000_000;
        System.out.println("걸린 시간 : " + time);
    }
}

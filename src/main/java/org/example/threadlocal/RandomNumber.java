package org.example.threadlocal;

import java.util.Random;

public class RandomNumber {
    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    public static Random random = new Random();

    public static Integer generateRandomNumber() {
        return random.nextInt(32);
    }

    public static void setRandomNumber() {
        threadLocal.set(random.nextInt(32));
    }

    public static void removeRandomNumber() {
        threadLocal.remove();
    }
}

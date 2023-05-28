package org.example.funtionalinterface;

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->
                System.out.println("runnable interface는 functionl interface입니다."));

        thread.start();
    }
}

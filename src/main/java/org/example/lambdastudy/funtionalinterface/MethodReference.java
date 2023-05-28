package org.example.lambdastudy.funtionalinterface;

import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;

        consumer.accept("Hello World!");
    }
}

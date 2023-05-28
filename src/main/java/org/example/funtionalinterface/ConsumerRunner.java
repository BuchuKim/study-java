package org.example.funtionalinterface;

import java.util.function.Consumer;

public class ConsumerRunner {
    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> System.out.println(str);

        consumer.accept("Hello World!");
    }
}

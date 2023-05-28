package org.example.lambdastudy.funtionalinterface;

import java.util.function.Predicate;

public class PredicateRunner {
    public static void main(String[] args) {
        Predicate<String> predicate = (str) -> str.equals("Hello World!");

        System.out.println(predicate.test("Hello World!"));
        System.out.println(predicate.test("Hello Word!"));
    }
}

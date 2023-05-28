package org.example.lambdastudy.funtionalinterface;

import java.util.function.Supplier;

public class SupplierRunner {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World!";

        System.out.println(supplier.get());
    }
}

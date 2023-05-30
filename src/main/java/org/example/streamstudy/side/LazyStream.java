package org.example.streamstudy.side;

import org.example.streamstudy.terminal.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyStream {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(
                Arrays.asList(new Product("밥",200),
                        new Product("국",100),
                        new Product("반찬",50)));

        products.stream().map(p -> {
            System.out.println("no terminate operation " + p.getName());
            return p;
        });

        products.stream().map(p -> {
            System.out.println("with terminate operation " + p.getName());
            return p;
        }).collect(Collectors.toList());
    }
}

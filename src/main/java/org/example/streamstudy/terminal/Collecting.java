package org.example.streamstudy.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collecting {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(
                Arrays.asList(new Product("밥",200),
                        new Product("국",100),
                        new Product("반찬",50)));

        // collect(Collectors.toList()) -> toList() 축약 가능
        List<String> names = products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());

        // IntStream 의 Calculating 기능과 동일 (조금 더 일반적인 상황에서 쓰임)
        double averagePrice = products.stream()
                .collect(Collectors.averagingInt(Product::getPrice));
    }
}

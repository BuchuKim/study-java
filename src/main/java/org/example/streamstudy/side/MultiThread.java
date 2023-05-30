package org.example.streamstudy.side;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class MultiThread {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> matched = new ArrayList<>();

        for (int i=0; i<5000; i++) {
            integers.add(i);
        }

        // race condition!
        integers.parallelStream().forEach(x -> {
            matched.add(x);
        });

        System.out.println(matched.size());
        System.out.println(matched.subList(0,10));
    }
}

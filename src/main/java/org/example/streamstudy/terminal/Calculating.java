package org.example.streamstudy.terminal;

import java.util.*;
import java.util.stream.IntStream;

public class Calculating {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(
                2,8231,44,283,-2,947,71));

        System.out.println("예제에서 사용하는 stream 예제 : " + integerList);

        // count
        System.out.println("count() : " + IntStream.of(2,8231,44,283,-2,947,71).count());

        // sum
        System.out.println("sum() : " + IntStream.of(2,8231,44,283,-2,947,71).sum());

        // optional min, max, average
        IntStream.of(2,8231,44,283,-2,947,71)
                .min().ifPresent(
                        m -> System.out.println("min() : " + m));
        IntStream.of(2,8231,44,283,-2,947,71)
                .max().ifPresent(
                        M -> System.out.println("max() : " + M));

        IntStream.of(2,8231,44,283,-2,947,71)
                .average().ifPresent(
                        avg -> System.out.println("average() : " + avg));
    }
}

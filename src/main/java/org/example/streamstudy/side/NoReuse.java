package org.example.streamstudy.side;

import java.util.stream.IntStream;

public class NoReuse {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(0,10);

        intStream.forEach(System.out::println);

        try {
            intStream.average().ifPresent(System.out::println);
        } catch (Exception e) {
            // IllegalStateException !!
            e.printStackTrace();
        }
    }
}

package org.example.streamstudy.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(
                Arrays.asList(2,8231,44,283,-2,947,71));

        integers.stream().sorted().forEach(System.out::println);
    }
}

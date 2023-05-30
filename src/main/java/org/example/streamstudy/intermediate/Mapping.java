package org.example.streamstudy.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mapping {
    public static void main(String[] args) {
        List<String> classRoom = new ArrayList<>(
                Arrays.asList("학생1","학생2","학생3","선생님1","책1","책2"));

        classRoom.stream().map(x -> "고양이 " + x).forEach(System.out::println);
    }
}

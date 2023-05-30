package org.example.streamstudy.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filtering {
    public static void main(String[] args) {
        List<String> classRoom = new ArrayList<>(
                Arrays.asList("학생1","학생2","학생3","선생님1","책1","책2"));

        System.out.println("교실에 존재하는 책 목록");
        classRoom.stream().filter(x -> x.contains("책")).forEach(System.out::println);
    }
}

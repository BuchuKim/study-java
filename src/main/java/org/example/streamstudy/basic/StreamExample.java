package org.example.streamstudy.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> classRoom = new ArrayList<>(
                Arrays.asList("학생1","학생2","학생3","선생님1","책1","책2"));

        System.out.println("학생 수는 " +
                classRoom.stream().filter(x -> x.contains("학생")).count() +
                "명 입니다.");
    }
}

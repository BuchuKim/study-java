package org.example.streamstudy.create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateStream {
    public static void main(String[] args) {
        List<String> classRoom = new ArrayList<>(Arrays.asList(
                "학생1","학생2","학생3","선생님1","책1","책2"));

        classRoom.stream().forEach(System.out::println);
        // 사실 collection 자체에서 제공하는 forEach() 메소드를 사용해도 됨
        // classRoom.forEach(System.out::println)
    }
}

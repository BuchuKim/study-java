package org.example.streamstudy.create;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateArray {
    public static void main(String[] args) {
        String [] classRoom = {
                "학생1","학생2","학생3","선생님1","책1","책2"};

        // Arrays.stream() 스태틱 메소드 사용
        Stream<String> classRoomStream = Arrays.stream(classRoom);

        classRoomStream.forEach(System.out::println);
    }
}

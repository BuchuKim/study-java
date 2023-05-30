package org.example.streamstudy.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterating {
    public static void main(String[] args) {
        List<String> classRoom = new ArrayList<>(
                Arrays.asList("학생1","학생2","학생3","선생님1","책1","책2"));
        classRoom.stream().peek(x-> System.out.println(x.contains("학생"))).close();

    }
}

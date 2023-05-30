package org.example.streamstudy.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForExample {
    public static void main(String[] args) {
        List<String> classRoom = new ArrayList<>(
                Arrays.asList("학생1","학생2","학생3","선생님1","책1","책2"));

        int studentNum = 0;
        for (String element : classRoom) {
            if (element.contains("학생")) {
                studentNum++;
            }
        }

        System.out.println("학생 수는 " +
                studentNum +
                "명 입니다.");
    }
}

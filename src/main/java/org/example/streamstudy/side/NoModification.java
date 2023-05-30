package org.example.streamstudy.side;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

public class NoModification {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        try {
            list.stream().forEach(x -> list.add(x));
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
        }
    }
}

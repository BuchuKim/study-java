package org.example.string.basic;

public class StringBasic {
    public static void main(String[] args) {
        String string = "string";

        for (Character c : string.toCharArray()) {
            System.out.print(c); // string
        }
    }
}

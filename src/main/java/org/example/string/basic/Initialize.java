package org.example.string.basic;

public class Initialize {
    public static void main(String[] args) {
        String string1 = "리터럴로 초기화";
        String string2 = new String("new로 초기화");

        // false
        System.out.println(string1 == string2);
    }
}

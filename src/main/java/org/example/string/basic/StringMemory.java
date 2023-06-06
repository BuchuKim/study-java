package org.example.string.basic;

public class StringMemory {
    public static void main(String[] args) {
        String string1 = "문자열";
        String string2 = "문자열";

        String string3 = new String("문자열");
        String string4 = new String("문자열");

        // true
        System.out.println(string1==string2);

        // false
        System.out.println(string2==string3);

        // false
        System.out.println(string3==string4);
    }
}

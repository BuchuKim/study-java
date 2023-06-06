package org.example.string.basic;

public class InternExample {
    public static void main(String[] args) {
        String string1 = "문자열";
        String string2 = new String("문자열");

        // false
        System.out.println(string1 == string2);

        string2 = string2.intern();
        // true
        System.out.println(string1 == string2);
    }
}

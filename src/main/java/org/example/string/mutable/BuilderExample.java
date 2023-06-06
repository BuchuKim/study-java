package org.example.string.mutable;

public class BuilderExample {
    public static void main(String[] args) {

        // same
        String string1 = "a" + "b" + "c" + "d" + "e";
        String string2 = (new StringBuilder()).append("a")
                .append("b")
                .append("c")
                .append("d")
                .append("e")
                .toString();
    }
}

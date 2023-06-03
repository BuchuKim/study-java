package org.example.annotation;

@OneElement(element = 3)
public class Example {
    public static void main(String[] args) {
        @TwoElements(name = "제 어노테이션입니다",value = 3)
        String hi;
    }
}

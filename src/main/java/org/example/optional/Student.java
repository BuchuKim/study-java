package org.example.optional;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Student {
    private final String name;
    private final int num;

    public boolean hasSameName(String name) {
        return name.equals(this.name);
    }

    @Override
    public String toString() {
        return "학생이름 : " + name + ", 번호 : " + num;
    }
}

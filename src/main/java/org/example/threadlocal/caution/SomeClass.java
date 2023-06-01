package org.example.threadlocal.caution;

public class SomeClass {
    String value;
    public SomeClass(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

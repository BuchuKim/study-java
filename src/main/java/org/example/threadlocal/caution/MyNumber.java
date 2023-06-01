package org.example.threadlocal.caution;

public interface MyNumber {
    ThreadLocal<SomeClass> threadLocal = new ThreadLocal<>();
}

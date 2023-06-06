package org.example.string.mutable;

public class BufferVsBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        TimeCheck.start();
        for (int i =0;i<50_000;i++) {
            stringBuilder.append("hi!");
        }
        TimeCheck.end();

        TimeCheck.printTime();

        TimeCheck.start();
        for (int i =0;i<50_000;i++) {
            stringBuffer.append("hi!");
        }
        TimeCheck.end();

        TimeCheck.printTime();
    }
}

package org.example.exception.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(new File("존재하지않는파일.txt"));
        } catch (IOException e) {
            // IOException 발생됐을 때 실행될 블록
            e.printStackTrace();
        } catch (Exception e) {
            // IOException 외, 일반적인 예외가 발생했을 때 실행될 블록
            e.printStackTrace();
        } finally {
            // 무조건 실행될 블록
            System.out.println("finally executed");
        }

    }
}

package org.example.lambdastudy.anonymous;

public class CalculatorRunner2 {
    public static void main(String[] args) {
        Calculator calculator = (x, y) -> x+y;

        System.out.print("1 + 2의 결과값은 ? : ");
        System.out.println(calculator.operate(1,2));
    }
}

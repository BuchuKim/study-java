package org.example.lambdastudy.anonymous;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator addCalculator = new Calculator() {
            @Override
            public int operate(int x, int y) {
                return x+y;
            }
        };

        System.out.print("1 + 2의 결과값은 ? : ");
        System.out.println(addCalculator.operate(1,2));
    }
}

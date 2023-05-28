package org.example.lambdastudy.funtionalinterface;

import java.util.function.Function;

public class FunctionRunner {
    public static void main(String[] args) {
        Function<Integer, String> myFunction = (intParam) -> "Hello " + intParam + "!";

        System.out.println(myFunction.apply(0));
    }
}

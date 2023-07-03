package edu.william.lambdas.aula02;

import java.util.function.BinaryOperator;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> calc = (a, b) -> {
            return a + b;
        };

        System.out.println(calc.apply(2.0, 3.0));

        calc = (a, b) -> {
            return a * b;
        };

        System.out.println(calc.apply(2.0, 3.0));

        BinaryOperator<Integer> calc2 = (a, b) -> {
            return a + b;
        };

        System.out.println(calc2.apply(2, 3));

    }

}

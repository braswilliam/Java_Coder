package edu.william.lambdas.aula1;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        // int → Double - não permite conversão
        // double → Double

        BinaryOperator<Double> calc = (x, y) ->  {return x + y;};
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x * y; // → aplicando de forma resumida.
        System.out.println(calc.apply(2.0, 2.0));


    }
}

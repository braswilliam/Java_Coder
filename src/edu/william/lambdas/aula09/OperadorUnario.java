package edu.william.lambdas.aula09;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisnDois = n -> n + 2; // 0 + 2 = 2
        UnaryOperator<Integer> vezes = n -> n * 2; // 2 + 2 = 4
        UnaryOperator<Integer> aoQuadrado = n -> n * n; // 4 * 4 = 16

        int valorTotal = maisnDois.andThen(vezes).andThen(aoQuadrado).apply(0);
        System.out.println(valorTotal);


    }




}

package edu.william.lambdas.funcao;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {


        Function<Integer, String> parOuImpar =
                valor -> valor % 2 == 0 ? "Par" : "Ímpar";

        Function<String, String> oResultadoE =
                valor -> "o resultado é : " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!";


        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32);


        System.out.println(resultadoFinal);

    }
}

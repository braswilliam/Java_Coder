package edu.william.lambdas.aula06;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar"; //sai String
        Function<String, String> oResultadoE = valor -> "O resultado é " + valor; // Sai String
        Function<String, String> empolgado = valor -> valor + "!!!";
        Function<String, String> duvida = valor -> valor + "???";

        String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(42);
        System.out.println(resultadoFinal1);

        String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(32);
        System.out.println(resultadoFinal2);

    }



}

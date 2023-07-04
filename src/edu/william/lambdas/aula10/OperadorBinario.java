package edu.william.lambdas.aula10;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media = (a, b) -> (a + b) / 2;
        System.out.println(media.apply(9.8, 5.7));

        //usando bifunction: tabalhando com dois pts flutuantes e retornando uma String:
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return  notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(9.0, 5.5));

        Function<Double, String> conceito = m -> m >= 7.0 ? "Aprovado" : "Reprovado";

        String resultFinal  = media.andThen(conceito).apply(9.0, 10.0);    ///aplicando composição de funções

        System.out.println(resultFinal.concat("oooo!!!"));



    }
}

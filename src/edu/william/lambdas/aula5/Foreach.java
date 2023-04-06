package edu.william.lambdas.aula5;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia","Lia","Gui");

        System.out.println("Forma Tradicional:");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\nLambda #01");
        aprovados.forEach(aprovado -> System.out.println(aprovado + "!!!"));


        System.out.println("\nMethod Reference #01");
        aprovados.forEach(System.out::println); //para cada pessoas que esteja na lista aprovados, imprima a saída.

        System.out.println("\nLambda #02");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02");;
        aprovados.forEach(Foreach::meuImprimir); //para cada pessoas que esteja na lista aprovados, imprima o método.

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi meu nome " + nome);
    }


}

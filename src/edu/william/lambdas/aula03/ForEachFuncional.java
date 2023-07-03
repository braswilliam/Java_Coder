package edu.william.lambdas.aula03;

import java.util.Arrays;
import java.util.List;

public class ForEachFuncional {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println();

        // forEach normal:
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        System.out.println();

        // forEach - lambda #01:
        System.out.println("forEach Funcional#01:");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        System.out.println();
        // Method reference: para cada pessoa que estja dentro da lista dos aprovados...
        // chame o System.out.println.
        System.out.println("Method reference#01:");
        aprovados.forEach(System.out::println);
        
        System.out.println();
        // forEach - lambda #02:
        System.out.println("forEach Funcional#2 pegando do método meuImprimir:");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod reference #02:");
        aprovados.forEach(ForEachFuncional::meuImprimir);


    }

    static void meuImprimir(String nome) {
       System.out.println("Oi meu nome é: " + nome);
    }

}
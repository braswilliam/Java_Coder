package edu.william.lambdas.aula2;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {


        List<String> aprovados = Arrays
                .asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional: ");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        System.out.println();
        System.out.println("Lambda #01:");

        //forma comum:
        aprovados.forEach(nome -> {
            System.out.println(nome + "!!!");
        });


        System.out.println();
        System.out.println("Forma simplificada:");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        //para cada pessoa que esteja dentro da lista "aprovados", chame o System.out::println
        System.out.println();
        System.out.println("Usando Method Reference 1:");
        aprovados.forEach(System.out::println);


        System.out.println();
        System.out.println("Lambda 2:");
        aprovados.forEach(nome -> meuImprimir(nome));


        System.out.println();
        System.out.println("Usando Method Reference 2:");
        aprovados.forEach(Foreach::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! meu nome é: " + nome);
    }

}

package edu.william.lambdas.aula4;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia","Lia","Gui");

        System.out.println("Forma Tradicional:");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\nLambda V.1...");
        aprovados.forEach(aprovado -> System.out.println(aprovado + "!!!"));


        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println); //para cada pessoas que esteja na lista aprovados, imprima a saída.




    }

}

package lambdas.aula02;

import java.util.Arrays;
import java.util.List;

import static lambdas.aula02.Imprimir.meuImprimir;

public class Foreach {
    public static void main(String[] args) {


        List<String> aprovados = Arrays.asList("Will", "Bia", "Lia", "Gui");


        System.out.println("Forma tradicional...");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> System.out.println(nome + "!!!!"));

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));


    }



}

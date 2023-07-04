package edu.william.lambdas.aula08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supridor {
    public static void main(String[] args) {

        Supplier<List<String>> umaLista = () -> Arrays.asList("Will", "Lia","bia", "Gui");
        System.out.println(umaLista.get());



    }
}

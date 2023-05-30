package edu.william.streams.aula3;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        System.out.println();
        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        //pega o cunteúdo da lista marcas coloca para maiúscula e imprime.
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);


       //UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        //UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        //UnaryOperator<String> grito = n -> n + "!!! ";
        
        System.out.println();
        System.out.println("\nUsando composição: ");
        marcas.stream()
            .map(Utilitarios.maiuscula)
            .map(Utilitarios.primeiraLetra)
            .map(Utilitarios::grito)
            .forEach(print);
    }

}

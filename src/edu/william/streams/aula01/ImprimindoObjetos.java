package edu.william.streams.aula01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("\nFor:");
        for (int i = 0; i < aprovados.size() ; i++) {
            System.out.println(aprovados.get(i));
        }

        System.out.println();
        System.out.println("foreach:");
        for (String aprovado:aprovados) {
            System.out.println(aprovado);
        }

        System.out.println();

        System.out.println("\nUsando iterator:");

        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("\nUsando Stream:");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // laço interno

    }

}

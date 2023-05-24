package edu.william.streams.aula1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {


        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

  /*      for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }*/

        System.out.println("\nUsando o foreach...");
        for (String nome:aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando o iterator...");
        Iterator<String> aprovado = aprovados.listIterator();
        while (aprovado.hasNext()) {
            System.out.println(aprovado.next());
        }

        System.out.println("\nUsando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // laço interno





    }
}

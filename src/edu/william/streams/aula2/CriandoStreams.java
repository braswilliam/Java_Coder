package edu.william.streams.aula2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {


    public static void main(String[] args) {


        Consumer<String> imprimir = System.out::print;
        Consumer<Integer> imprimirNumero = System.out::print;

        Stream<String> langs = Stream.of("Java", "Lua", "JS\n");
        langs.forEach(imprimir);

        String[] maisLangs = {"Python ", "Lisp ","Perl ", "Go\n"};
        Stream.of(maisLangs).forEach(imprimir);

        System.out.println("\n\nfoma de usar:\n" );
        Arrays.stream(maisLangs).forEach(imprimir);
        Arrays.stream(maisLangs,0,4).forEach(imprimir);

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin ");
        outrasLangs.stream().forEach(imprimir);
        outrasLangs.parallelStream().forEach(imprimir);

       //Stream.generate(() -> "a").forEach(imprimir);
       // Stream.iterate(0, n -> n + 1).forEach(imprimirNumero);



    }

}

package edu.william.streams.aula2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;

public class CriandoStreams {


    public static void main(String[] args) {

    
        //recebe um parâmetro e não retorna nada.
        Consumer<String> print =  System.out::println;
        Consumer<Integer> println =  System.out::println;

        Stream<String> langs = Stream.of("Java " , "Lua ", "JS\n");
        //imprimindo da lista
        langs.forEach(print);


        String [] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
        //imprimindo do Array
        Stream.of(maisLangs).forEach(System.out::println);
        Arrays.stream(maisLangs, 1, 2).forEach(print);
        System.out.println();
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        System.out.println();
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);
        
        //gerando valores de forma infinita:
        //Stream.generate(() -> "a").forEach(print);

        //outra maneira de gerar valores de forma infinita:
        Stream.iterate(0, n -> n + 1).forEach(println);
    }

}

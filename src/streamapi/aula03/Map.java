package streamapi.aula03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {


        Consumer<String> print = System.out::println;


        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda\n");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);


        UnaryOperator<String> maiucula = n -> n.toUpperCase();
        UnaryOperator<String> primeraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!";




        System.out.println("usando composição: ");

        marcas.stream()
                .map(Utilitario.maiucula)
                .map(Utilitario.primeraLetra)
                .map(Utilitario::grito)
                .forEach(print);
    }
}

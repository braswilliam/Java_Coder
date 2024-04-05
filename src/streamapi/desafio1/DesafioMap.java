package streamapi.desafio1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Consumer<Object> print = System.out::println;

        Function<Integer, String> converterParaBinario = Integer::toBinaryString;
        UnaryOperator<String> invertNumeros = n ->  new StringBuilder(n).reverse().toString();
        Function<String, Integer> converterParaInteiro = n -> Integer.parseInt(n,2);

        nums.stream().map(converterParaBinario)
                .map(invertNumeros)
                .map(converterParaInteiro)
                .forEach(print);


    }
}

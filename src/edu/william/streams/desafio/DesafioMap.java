package edu.william.streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        UnaryOperator<String> inverter = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> binarioparaInteiro = s -> Integer.parseInt(s, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioparaInteiro)
                .forEach(System.out::println);



    }
}

package streamapi.desafio1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FormaMaisObjetiva {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Consumer<Object> print = System.out::println;

        nums.stream().map(Integer::toBinaryString)
                .map(n ->  new StringBuilder(n).reverse().toString())
                .map(n -> Integer.parseInt(n,2))
                .forEach(print);


    }
}

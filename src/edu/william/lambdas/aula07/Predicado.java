package edu.william.lambdas.aula07;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        Predicate<Integer> ispar = num -> num % 2 == 0; //boolean
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999; //boolean

        System.out.println(ispar.and(isTresDigitos).negate().test(123)); //compara dois resultados com end. Manooo. Esse negate é lindo!
        System.out.println(ispar.or(isTresDigitos).test(123)); //compara dois resultados com or. Manooo. Esse negate é lindo!


    }
}

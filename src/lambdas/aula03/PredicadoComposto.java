package lambdas.aula03;

import java.util.function.Predicate;

public class PredicadoComposto {
    public static void main(String[] args) {


        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos =
                num -> num >= 100 && num <= 999;

        // O uso do negate modifica o resultado:
        System.out.println(isPar.and(isTresDigitos).negate().test(123)); //uso do and com o negate
        System.out.println(isPar.or(isTresDigitos).test(301)); //verdadeiro por que é par ou três dígitos: uso do or
        System.out.println(isPar.and(isTresDigitos).test(22)); //uso apenas do and



    }
}

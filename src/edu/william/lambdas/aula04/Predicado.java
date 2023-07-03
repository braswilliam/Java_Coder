package edu.william.lambdas.aula04;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {


        Predicate<Produto> isCaro = prod -> ((prod.preco * (1 - prod.desconto)) >= 750); //se for maior que 750 é true

        Produto prod = new Produto("Notebook", 3893.89, 0.15);
        System.out.println(isCaro.test(prod));



    }
}

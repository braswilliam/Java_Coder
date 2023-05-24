package edu.william.lambdas.cosumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!!");


        Produto p1 = new Produto("Caneta", 12.34, 0.5);
        Produto p2 = new Produto("Lápis", 2.34, 0.03);
        Produto p3 = new Produto("Mouse", 50.34, 0.18);
        Produto p4 = new Produto("Régua", 1.34, 0.19);
        Produto p5 = new Produto("Régua", 1.34, 0.09);


        List<Produto> produtos = Arrays.asList(p1, p1, p2, p3, p4);

        produtos.forEach(imprimirNome);

        produtos.forEach(p -> System.out.println(p.preco));

        produtos.forEach(System.out::println);


    }
}

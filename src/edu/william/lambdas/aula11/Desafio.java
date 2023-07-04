package edu.william.lambdas.aula11;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {


        Produto p = new Produto ("Ipad",3235.89, 0.13 );

        Function<Produto, Double> valorReal = produto -> produto.preco * (1 - produto.desconto); //double
        UnaryOperator<Double> impostoMunicipal = produto -> produto >= 2500 ? produto * (1 + 0.085) : produto;//double
        UnaryOperator<Double> frete = produto -> produto >= 3000 ? produto + 100 : produto + 50;
        Function<Double, String> arredonda = produto -> String.format("%.2f", produto);
        UnaryOperator<String> formata = produto -> "R$" + produto;


        System.out.printf(valorReal.andThen(impostoMunicipal).andThen(frete).andThen(arredonda).andThen(formata).apply(p));



    }
}

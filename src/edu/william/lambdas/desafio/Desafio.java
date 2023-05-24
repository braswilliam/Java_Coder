package edu.william.lambdas.desafio;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Function<Produto, Double> precoFinal =
                produto -> produto.getPreco() * (1 - produto.getDesconto());

        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;

        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f", preco));

        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("ipad", 3235.89, 0.13);

        Double preco = arredondar
                .compose(frete)
                .compose(impostoMunicipal)
                .compose(precoFinal)
                .apply(p);

        String precoFormatado = formatar.apply(preco);

        System.out.println("O preço final é " + precoFormatado);
    }
}

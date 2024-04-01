package lambdas.desafio;

import lambdas.aula03.Produto;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Function<Produto, Double> precoFinal =p -> p.getPreco() * (1 - p.getDesconto());
        UnaryOperator<Double> impostoMunicipal = preco ->  preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar = preco -> "R$" + preco + ".";


        Produto p = new Produto("Ipad", 3235.89, 0.13);


        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preco final é " + preco);



    }
}

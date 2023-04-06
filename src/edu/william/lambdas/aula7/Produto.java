package edu.william.lambdas.aula7;

public class Produto extends Object{

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }


    @Override
    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return nome + " tem o preço de R$" + String.format("%.2f",precoFinal);
    }
}

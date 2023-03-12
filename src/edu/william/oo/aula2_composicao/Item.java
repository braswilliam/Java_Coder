package edu.william.oo.aula2_composicao;

public class Item {

    String nome;
    int quantidade;
    double preco;

    Compra compra;

    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }


}

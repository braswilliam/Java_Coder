package edu.william.oo.composicao.um_pra_muitos;

public class Item {

    String nome;
    int quantidade;
    double preco;
    Compra compra;


    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }


}

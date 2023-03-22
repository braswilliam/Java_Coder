package edu.william.oo.composicao.um_pra_muitos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Compra { //uma Compra

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>(); //Tem muitos Itens

    //terei que estanciar os itens e add na minha lista
    void adicionarItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    //já instancia os itens e add na lista
    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }



    double obterValorTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }
        return  total;
    }

    int obterQuantidadeItens() {
        return itens.size();
    }



}




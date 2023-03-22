package edu.william.oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> compras = new ArrayList<>();


    public Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarComnpra(Compra compra) {
        this.compras.add(compra);
    }

    void remorverCompra(Compra compra) {
        this.compras.remove(compra);
    }


    double obterValorTotal() {
        double total = 0;

        for (Compra compra:compras) {
            total += compra.obterValorTotal();
        }

        return total;
    }

}

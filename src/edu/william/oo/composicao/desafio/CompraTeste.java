package edu.william.oo.composicao.desafio;

import java.util.Arrays;
import java.util.Locale;

public class CompraTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);

        Cliente cliente = new Cliente("William B.");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1, 100);
        compra1.adicionarItem(new Produto("Notebook", 2000.00), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 1000.00), 1);


        cliente.adicionarComnpra(compra1);
        cliente.adicionarComnpra(compra2);

        System.out.println(cliente.obterValorTotal());


    }
}

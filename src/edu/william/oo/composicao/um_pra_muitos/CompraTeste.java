package edu.william.oo.composicao.um_pra_muitos;

import java.util.Locale;

public class CompraTeste {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";

        compra1.adicionarItem("Caneta", 20, 7.45);
        compra1.adicionarItem("Borracha", 12, 3.89);
        compra1.adicionarItem("Caderno", 3, 18.79);

        System.out.println("\nDados:");

        System.out.println("Quantidade de itens comprados: " + compra1.obterQuantidadeItens());
        System.out.println("O valor total das compras: " + compra1.obterValorTotal());

        //so para mostrar a relação bidirecional
        double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();

        System.out.println("O total dos itens comprado é " + total);




    }


}

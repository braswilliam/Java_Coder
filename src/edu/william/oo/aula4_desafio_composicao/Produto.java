package edu.william.oo.aula4_desafio_composicao;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    

    private Double preco;
    private String nome;


    List<Item> items = new ArrayList<>();

    
    public void addItens(Item item) {
        items.add(item);
    }

    



}

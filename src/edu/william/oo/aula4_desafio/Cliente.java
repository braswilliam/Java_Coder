package edu.william.oo.aula4_desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String name;

    List<Compra> compras = new ArrayList<>();


    public Cliente(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Compra> getCompras() {
        return compras;
    }

 


}

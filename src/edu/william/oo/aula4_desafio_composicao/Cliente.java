package edu.william.oo.aula4_desafio_composicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;

    List<Compra> compras = new ArrayList<>();

    public Cliente() {

    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}

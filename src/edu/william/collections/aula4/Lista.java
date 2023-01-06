package edu.william.collections.aula4;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        
        
        List<Usuario> lista = new ArrayList<>();
        
        //aqui criei uma variável e add na lista:
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        
        //criei o obj e add direto na lista:
        lista.add(new Usuario("Carlos")); //criando um usuário e add a lista
        lista.add(new Usuario("Lia")); 
        lista.add(new Usuario("Bia")); 
        lista.add(new Usuario("Manu")); 
        
        
        System.out.println(lista.get(3).nome);
        System.out.println();

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}

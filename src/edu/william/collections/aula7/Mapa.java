package edu.william.collections.aula7;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import edu.william.collections.aula4.Usuario;

public class Mapa {
    public static void main(String[] args) {
        //O código do usuario e o nome.
        Map<Integer, String> usuarios = new HashMap<>();

        //colocar elemnto put()
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); //imprime as chaves
        System.out.println(usuarios.values()); //imprimindo os valores

        System.out.println(usuarios.entrySet()); // imprimindo chave e valor

        System.out.println(usuarios.containsKey(20));//verificando se contem a chave de numero...20
        System.out.println(usuarios.containsValue("Rebeca")); // verificado se contem o valor... "Rebeca"

        System.out.println(usuarios.get(20));
        

        System.out.println("perconrrendo...");

        //percorrendo as chaves:
        for (Integer chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        //imprimindo o valor:
        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        //removendo:
        System.out.println("Foi Removido: " + usuarios.remove(20));

        //percorrendo os dois: 
        
        for(Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + ": ");
            System.out.println(registro.getValue());
        }










    }
}

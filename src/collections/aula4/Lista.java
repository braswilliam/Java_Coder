package collections.aula4;

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
        
        
        System.out.println(lista.get(3));
        System.out.println(lista.get(2));
        
        System.out.println();//Pula Linha

        //removendo da lista:
        lista.remove(1); //Carlos
        
        //removendo apartir de um objeto:
        lista.remove(new Usuario("Manu"));
        
        //verificando se contem na lista:
        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}

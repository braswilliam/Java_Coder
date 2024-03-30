package collections.aula2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
    
    public static void main(String[] args) {
        
        Set<String> listaAprovados = new HashSet<>(); //Operador diamond: <>
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");


        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

    }

}

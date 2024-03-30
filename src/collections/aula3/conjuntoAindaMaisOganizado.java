package collections.aula3;


import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoAindaMaisOganizado {
    

    public static void main(String[] args) {
        
        //sortedSet é uma lista de conjuntos que apresenta ordenação.
        //se quiser ser mais simplista pode colocar TreeSet de um lado e Treeset do outro.
        SortedSet<String> listaAprovados = new TreeSet<>(); //TreeSet -> garante a ordem de inserção
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");


        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        System.out.println();//pula linha


        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);


        for (Integer n : nums) {
            System.out.println(n);
        }
        

    }


}

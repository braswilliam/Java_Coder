package collections.aula5;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        
        //add a fila
        //Caso consiga add ele retorna true or false
        fila.add("Ana");
        
       
        //System.out.println(fila.offer("Bia")); 
        
        // Offer e Add-> adicionam elementos na fila:
        // A diferença do offer para o add, sera o comportamento quando a fila está cheia.
        
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");
        
        // A diferença é que o peek em caso de elementos vazios lança um null
        // já o element lança uma Exeption.
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        //fila.clear();
        //fila.size();
        //fila.isEmpty();


        // a diferença do comportamento ocorre quando a fila está vazia:
        
        //Pega o primeiro elemnto da fila e retorna já removendo: 
        //System.out.println(fila.poll()); -> lança null 
        //System.out.println(fila.poll());
        //System.out.println(fila.poll());
        //System.out.println(fila.poll());
        //System.out.println(fila.poll());
         //System.out.println(fila.remove()); -> lança uma exceção


         // fila.contains(...);
         



    }
}

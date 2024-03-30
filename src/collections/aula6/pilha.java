package collections.aula6;

import java.util.ArrayDeque;
import java.util.Deque;

public class pilha {
    public static void main(String[] args) {
        
        Deque<String> livros = new ArrayDeque<String>(); //opcional

        livros.add("O Pequeno Prícipe");
        livros.push("Dom Quixote");
        livros.push("O Hobbit"); //esse entrou por último

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.pop()); // -> pode jogar um Exception

        livros.add("neuromancer");

        for (String livro : livros) {
           System.out.println(livro); 
        }


        System.out.println(livros);




    }
}

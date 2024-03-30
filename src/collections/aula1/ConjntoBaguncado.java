package collections.aula1;

import java.util.HashSet;
import java.util.Set;

public class ConjntoBaguncado {
    @SuppressWarnings({"rawtyoes", "unchecked"}) // ocultando as advertências
    
    public static void main(String[] args) {
       
        HashSet conjunto = new HashSet<>();
        
        conjunto.add("1.2");  //double converte-> Double
        conjunto.add(true); //boolean converte-> Boolean 
        conjunto.add("Teste"); //String
        conjunto.add(1); // int converte-> Integer
        conjunto.add('X');// char converte-> Character


        System.out.println("O tamanho é: " + conjunto.size());// tamanho do conjunto
        
        // removendo item "teste não existe retornará falso"
        System.out.println("Removendo... " + conjunto.remove("teste")); 
        System.out.println("Removendo... " + conjunto.remove("Teste")); 
        System.out.println("Removendo... " + conjunto.remove('X')); 

        System.out.println("Tamanho é : " + conjunto.size());

        System.out.println(conjunto.contains('X'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));


        Set nums = new HashSet();
        
        nums.add(1);
        nums.add(2);
        nums.add(3);
        

        System.out.println(nums); //imprimindo 
        System.out.println(conjunto);

        //fazendo a união entre os conuntos
        //isso muda o estado do objeto conjunto.
        
        //conjunto.addAll(nums);
        //System.out.println("Conjuto e nums unidos: " + conjunto);

        //interceção:
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        //limpando o obj conjunto

        conjunto.clear();
        System.out.println(conjunto);
    }
}

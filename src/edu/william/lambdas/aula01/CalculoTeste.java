package edu.william.lambdas.aula01;

public class CalculoTeste {
    
    public static void main(String[] args) {
        
        Calculo soma = new Soma();
        Calculo multiplicacao = new Multiplicar();

        System.out.println(soma.executar(2, 2));
        System.out.println( multiplicacao.executar(2, 2));

        


    }


}

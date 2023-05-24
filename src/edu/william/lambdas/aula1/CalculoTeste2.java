package edu.william.lambdas.aula1;

public class CalculoTeste2 {
    public static void main(String[] args) {


        Calculo calc = (a, b) -> {return a + b;};
        System.out.println(calc.executar(2, 3));

        calc = (a, b) -> a * b;
        System.out.println(calc.executar(2,2));




    }
}

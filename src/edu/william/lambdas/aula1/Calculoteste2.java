package edu.william.lambdas.aula1;

public class Calculoteste2 {

    public static void main(String[] args) {


        Calculo calc = (x, y) -> { return x + y; };
        System.out.println(calc.executar(2,3));

        //outra forma:
        calc = (x,y) -> x * y;
        System.out.println(calc.executar(2,3));

    }

}

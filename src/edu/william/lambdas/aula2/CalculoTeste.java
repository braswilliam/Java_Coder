package edu.william.lambdas.aula2;

public class CalculoTeste {
    public static void main(String[] args) {


        Calculo calculo = new Soma(); //aponta para Soma
        System.out.println(calculo.executar(2,3));

        calculo = new Multiplicar(); //aponta para Multiplicar
        System.out.println(calculo.executar(2,3));

        System.out.println(calculo.legal());
        System.out.println(Calculo.muitoLegal());

    }
}

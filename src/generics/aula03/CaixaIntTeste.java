package generics.aula03;

import generics.aula02.Caixa;

public class CaixaIntTeste {

    public static void main(String[] args) {


        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(142);
        int coisaA = caixaA.abrir();
        System.out.println(coisaA);



    }

}

package edu.william.oo.encapsulamento.aula1.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void TesteAcessos() {
       //segredo
       //facodentrodeCasa
       //formadeFalar
       //todosSabem

        //System.out.println(esposa.segredo); // segredo é privado.
        System.out.println(esposa.facodentrodeCasa);
        System.out.println(esposa.formadeFalar);
        System.out.println(esposa.todosSabem);
    }

}

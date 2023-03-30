package edu.william.oo.encapsulamento.aula1.casaB;

import edu.william.oo.encapsulamento.aula1.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();
    void TesteAcessos() {
        //segredo
        //facodentrodeCasa
        //formadeFalar
        //todosSabem

        //System.out.println(sogra.segredo); // segredo é privado.
        //System.out.println(sogra.facodentrodeCasa);
        //System.out.println(sogra.formadeFalar);
        System.out.println(sogra.todosSabem);
    }



}

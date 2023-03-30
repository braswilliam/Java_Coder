package edu.william.oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa cliente = new Pessoa(55.00);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.3);
        Sorvete sobremesa = new Sorvete(0.4);

        cliente.comer(ingrediente1);
        cliente.comer(ingrediente2);
        cliente.comer(sobremesa);

        System.out.println(cliente.getPeso());

    }

}

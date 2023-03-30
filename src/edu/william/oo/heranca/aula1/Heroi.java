package edu.william.oo.heranca.aula1;

public class Heroi extends Jogador{

    Heroi() {
        this(0,0);
    }

    public Heroi(int x, int y) {
        super(x, y);
    }

    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
    }

}

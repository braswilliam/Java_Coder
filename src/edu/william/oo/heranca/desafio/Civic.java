package edu.william.oo.heranca.desafio;

public class Civic extends Carro {

    Civic() {
        super(212);
    }

    Civic(int velocidadeMaxima){
        super(velocidadeMaxima);
    }

    @Override
    void acelerar() {
        super.acelerar();
        super.acelerar();
    }

    void frear() {
        super.frear();
    }

    @Override
    public String toString() {
        return "velocidadeatual da Civic: " + velocidadeatual + "Km/h";
    }
}

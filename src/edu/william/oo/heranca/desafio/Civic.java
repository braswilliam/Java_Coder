package edu.william.oo.heranca.desafio;

public class Civic extends Carro {

    @Override
    void acelerar() {
        super.acelerar();
    }

    void frear() {
        super.frear();
    }

    public String toString() {
        return "velocidadeatual da Civic: " + velocidadeatual;
    }

}

package edu.william.oo.heranca.desafio;

public class Ferrari extends Carro{


    @Override
    void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }

    void frear() {

        if (this.velocidadeatual < 0) {
            this.velocidadeatual = 0;
        } else {
            this.velocidadeatual -= 5;
        }

    }

    public String toString() {
        return "velocidadeatual da Ferrari: " + velocidadeatual;
    }

}
package edu.william.oo.heranca.desafio;

public class Carro {

    int velocidadeatual = 0;
    boolean ligado = false;


    void ligar() {
        this.ligado = true;
    }

    void desligar() {
        this.ligado = false;
    }

    void acelerar() {
        if (this.ligado == true) {
            this.velocidadeatual += 5;
        } else {
            System.out.println("Carro desligado");
        }
    }

    void frear() {
        if (this.velocidadeatual >= 5) {
            this.velocidadeatual -= 5;
        } else {
            this.velocidadeatual = 0;
        }
    }


}

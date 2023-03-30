package edu.william.oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeatual;
    boolean ligado;
    private int delta = 5;


    public Carro(int VELOCIDADE_MAXIMA) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
    }


    void ligar() {
        this.ligado = true;
    }

    void desligar() {
        this.ligado = false;
    }

    void acelerar() {
        if (this.ligado == true){
            if (velocidadeatual + getDelta() > VELOCIDADE_MAXIMA){
                this.velocidadeatual = VELOCIDADE_MAXIMA;
            } else {
                this.velocidadeatual += getDelta();
            }
        }
    }

    void frear() {
        if (this.velocidadeatual >= 5) {
            this.velocidadeatual -= 5;
        } else {
            this.velocidadeatual = 0;
        }
    }


    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public String toString() {
        return "velocidadeatual: " + velocidadeatual;
    }
}

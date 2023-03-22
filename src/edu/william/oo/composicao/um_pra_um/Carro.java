package edu.william.oo.composicao.um_pra_um;

public class Carro {

    final Motor motor;

    Carro() {
        this.motor = new Motor(this); //O próprio obj ta passando para construir o motor
    }

    void acelerar() {
        if(motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if(motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }

}

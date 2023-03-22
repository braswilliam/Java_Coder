package edu.william.oo.composicao.um_pra_um;

public class CarroTeste {
    public static void main(String[] args) {


        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());

        Motor m1 = new Motor(c1);
        m1.carro.ligar();
        System.out.println("MOTOR1 LIGADO?: " + m1.carro.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();


        //relação bidirecional
        System.out.println(c1.motor.carro.motor.carro.motor.giros());
    }
}

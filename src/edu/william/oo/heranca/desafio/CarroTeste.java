package edu.william.oo.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {

        Civic civic  = new Civic();
        civic.ligar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();



        Ferrari ferrari = new Ferrari();
        ferrari.ligar();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        ferrari.ligarTurbo();
        ferrari.acelerar();
        ferrari.desligarTurbo();

        System.out.println(civic);
        System.out.println(ferrari);

        System.out.println(ferrari.velocidadedoAr());

    }


}

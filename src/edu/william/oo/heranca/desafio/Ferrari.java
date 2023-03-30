package edu.william.oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo;
    private boolean ligarAr;

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
      super(velocidadeMaxima);
      super.setDelta(15);
    }

 /*   @Override
    void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }*/


    @Override
    public void ligarTurbo() {
        this.ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        this.ligarTurbo = true;
    }

    @Override
    public void ligarAr() {
        this.ligarAr = true;
    }

    @Override
    public void desligarAr() {
        this.ligarAr = false;
    }


    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr){
            return 35;
        } else if (ligarTurbo && ligarAr){
            return 30;
        } else if (!ligarTurbo && !ligarAr){
            return 20;
        } else {
            return 15;
        }

    }

    void frear() {

        if (this.velocidadeatual < 0) {
            this.velocidadeatual = 0;
        } else {
            this.velocidadeatual -= 5;
        }

    }

    @Override
    public String toString() {
        return "velocidadeatual da Ferrari: " + velocidadeatual + "Km/h";
    }
}

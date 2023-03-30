package edu.william.oo.heranca.desafio;

public interface Luxo {

    public void ligarAr();
    abstract void desligarAr();

    default int velocidadedoAr() {
        return 1;
    }


}

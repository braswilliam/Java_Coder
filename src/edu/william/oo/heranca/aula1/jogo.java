package edu.william.oo.heranca.aula1;

public class jogo {
    public static void main(String[] args) {
        
        Monstro m1 = new Monstro();
        m1.x = 10;
        m1.y = 10;

        Heroi h1 = new Heroi();
        h1.x = 10;
        h1.y = 11;


        System.out.println("\nHP do heroi: " + h1.vida);
        System.out.println("HP do monstro: " + m1.vida);

        m1.atacar(h1);

        System.out.println("\nHP do heroi: " + h1.vida);
        System.out.println("HP do monstro: " + m1.vida);


        h1.atacar(m1);


        System.out.println("\nHP do heroi: " + h1.vida);
        System.out.println("HP do monstro: " + m1.vida);
    }
}

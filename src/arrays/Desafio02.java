package arrays;


import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        int tamanho = sc.nextInt();
        int[] numeros = new int[tamanho];

        int in = 0;
        int out = 0;

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int numero : numeros) {
            if (numero >= 10 && numero <= 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();



    }
}

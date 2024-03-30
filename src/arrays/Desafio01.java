package arrays;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for (int i = 0; i < 10000; i++) {
            if (i % numero == 2) {
                System.out.println(i);
            }
        }



        sc.close();


    }
}

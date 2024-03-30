package arrays;


import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[100];

        int maiorValor = Integer.MIN_VALUE; // Inicialize com o menor valor possível
        int posicaoMaiorValor = -1;

        for (int i = 0; i < 100; i++) {
            int numero = sc.nextInt();
            numeros[i] = numero;

            // Verifique se o número lido é maior que o maior valor atual
            if (numero > maiorValor) {
                maiorValor = numero;
                posicaoMaiorValor = i + 1; // Adicione 1 para contar a posição a partir de 1
            }
        }

        sc.close();

        System.out.println(maiorValor);
        System.out.println(posicaoMaiorValor);
    }
}

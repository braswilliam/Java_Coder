package arrays;

import java.util.Locale;
import java.util.Scanner;

public class desafioArrays {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas Notas Você deseja armazenar: ");
        int Quantidadenotas = input.nextInt();

        double [] notas  = new double [Quantidadenotas];
        
        
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("informe a nota %dº do aluno: ", i + 1);
            notas[i] = input.nextDouble();
        }
        
        double somador = 0;
        for (double nota : notas) {
            somador += nota;
        }
        
        System.out.printf("A média do aluno é %.2f", somador / notas.length );

        input.close();
    }
}

package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos Alunos? ");
        int qtAlunos = input.nextInt();

        System.out.print("Quantos nota por aluno? ");
        int qtNomtas = input.nextInt();

        System.out.println();

        //array de duas dimen dimensões O mais externo qtAluno e o mais Interno qtNotas:
        double [] [] notasDaturma = new double [qtAlunos] [qtNomtas]; 

        double total = 0;
        for (int aluno = 0; aluno < notasDaturma.length; aluno++) {
            for (int nota = 0; nota < notasDaturma[aluno].length; nota++) {
                System.out.printf("Informe a nota %d do aluno %d: ", nota+1, aluno+1);
                notasDaturma[aluno][nota] = input.nextDouble();
                total += notasDaturma [aluno][nota];
            }
            System.out.println();
        }

        //Se tivemos 3 alunos e 3 notas será um total de 9 notas.

        double media = total / (qtAlunos * qtNomtas); 
        System.out.printf("Média da turma é: %.2f%n",  media);
        
        System.out.println();
        int contador = 1;
        System.out.println("iprimindo todas as notas:");
        for (double[] notasDoAluno : notasDaturma) {
            System.out.printf("Aluno %d notas: ", contador );
            System.out.println(Arrays.toString(notasDoAluno));
            contador++;
        }


        input.close();
        

    }
}

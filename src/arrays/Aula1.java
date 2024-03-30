package arrays;

public class Aula1 {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4]; // atribuindo 3 posições do tipo double
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;


        //System.out.println(Arrays.toString(notasAlunoA)); //imprimindo as notas 

        double totalAlunoA = 0; //iniciando um contador para calc a média
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        //imprimindo a média:
        System.out.printf("A média do aluno A é %.2f%n", totalAlunoA/ notasAlunoA.length);
        

        System.out.println("Primeira nota do aluno: " + notasAlunoA[0]);
        System.out.println("Ultima nota do aluno" + notasAlunoA[notasAlunoA.length - 1]);
        System.out.println("Penultima nota do aluno: " + notasAlunoA[notasAlunoA.length-2]);
        System.out.println("Antepenultima nota do aluno: " + notasAlunoA[notasAlunoA.length-3]);
        
        System.out.println(); //pulando linha

        final double NOTAS_ARMAZENADAS = 5.5;
        double [] notasAlunoB = {6,9, 8,9, NOTAS_ARMAZENADAS, 10}; //iniciando as notas diretamente.
        double totalAlunoB = 0;

        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }

        System.out.printf("A média do aluno B é %.2f%n%n", totalAlunoB/ notasAlunoB.length);

        System.out.println(); //pulando linha

        double [] notasAlunoC = {10.0, 4.0, 7.0, 8.0};
        double totalAlunoC = 0;

        for (double nota : notasAlunoC) {
            totalAlunoC += nota;
        }

        System.out.printf("A média do aluno C é %.2f%n%n", totalAlunoC/ notasAlunoC.length);

        
    }

}

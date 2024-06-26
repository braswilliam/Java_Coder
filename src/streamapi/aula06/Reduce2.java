package streamapi.aula06;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Reduce2 {


    public static void main(String[] args) {


        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;
        Function<Aluno, Double> getNota = aluno -> aluno.getNota();
        BinaryOperator<Double> somatorio = (a, b) -> a + b;
        Function<Double, String> formatar = nota -> String.format("%.2f", nota);

        //Pipeline de execução:

        alunos.parallelStream()
                .filter(aprovado)
                .map(getNota)
                .reduce(somatorio)
                .map(formatar)
                .ifPresent(System.out::println);

    }


}

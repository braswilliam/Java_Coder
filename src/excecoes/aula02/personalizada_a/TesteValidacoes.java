package excecoes.aula02.personalizada_a;

import streamapi.aula06.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {


        Aluno aluno = new Aluno("", -7);

        Validar.aluno(aluno);

        System.out.println("fim: ");

    }
}

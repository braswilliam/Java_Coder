package excecoes.aula02.personalizada_b;

import streamapi.aula06.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) throws NumeroForaDeIntervaloException, StringVaziaException {


        Aluno aluno = new Aluno("", -7);

        Validar.aluno(aluno);

        System.out.println("fim: ");

    }
}

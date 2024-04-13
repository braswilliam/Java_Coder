package excecoes.aula02.personalizada_a;

import streamapi.aula06.Aluno;

public class TesteValidacaoDois {
    public static void main(String[] args) {


        try {
            Aluno a1 = new Aluno("William", -7);
            Validar.aluno(a1);
        } catch (StringVaziaException | NumeroForaDeIntervaloException | NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }
}

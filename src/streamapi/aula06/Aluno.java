package streamapi.aula06;

import java.util.Objects;

public class Aluno {
   public final String nome;
   public final double nota;
   public final boolean bomComportamento;


   public Aluno(String nome, double nota) {
       this.nome = nome;
       this.nota = nota;
       this.bomComportamento = true;
   }

    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return
                "nome:" + nome +
                ", nota:" + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(nota, aluno.nota) == 0 && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }



}

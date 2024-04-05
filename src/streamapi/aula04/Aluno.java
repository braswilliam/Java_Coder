package streamapi.aula04;

public class Aluno {

    final String nome;
    final Double nota;
    final Boolean comportamento;

    public Aluno(String nome, Double nota, boolean comportamento) {
        this.nome = nome;
        this.nota = nota;
        this.comportamento = comportamento;
    }


    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }

    public Boolean getComportamento() {
        return comportamento;
    }
}

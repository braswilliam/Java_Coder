package streamapi.desafio2;

public class ProdutoRespProfessor {
    final private String nome;
    final private double preco;
    final private double desconto;
    final private double valorFrete;


    public ProdutoRespProfessor(String nome, double preco, double desconto, double valorFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValorFrete() {
        return valorFrete;
    }




}

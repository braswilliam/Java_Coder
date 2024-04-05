package streamapi.desafio2;

public class ProdutoDois {
    private final String nome;
    private final Double preco;
    private final Boolean promocional;
    private final double frete;


    public ProdutoDois(String nome, Double preco, boolean promocional, double frete) {
        this.nome = nome;
        this.preco = preco;
        this.promocional = promocional;
        this.frete = frete;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Boolean getPromocional() {
        return promocional;
    }

    public double getFrete() {
        return frete;
    }


}

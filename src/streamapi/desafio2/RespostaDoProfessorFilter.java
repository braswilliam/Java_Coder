package streamapi.desafio2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class RespostaDoProfessorFilter {
    public static void main(String[] args) {

        ProdutoRespProfessor p1 = new ProdutoRespProfessor("Lapis", 1.99, 0.35, 0);
        ProdutoRespProfessor p2 = new ProdutoRespProfessor("NoteBook", 4899, 0.32, 0);
        ProdutoRespProfessor p3 = new ProdutoRespProfessor("Caderno", 30, 0.45, 0);
        ProdutoRespProfessor p4 = new ProdutoRespProfessor("Impressora", 1200, 0.40, 0);
        ProdutoRespProfessor p5 = new ProdutoRespProfessor("iPad", 3100, 0.29, 0);
        ProdutoRespProfessor p6 = new ProdutoRespProfessor("Relógio", 1900, 0.12, 0);
        ProdutoRespProfessor p7 = new ProdutoRespProfessor("Monitor", 800, 0.31, 0);

        List<ProdutoRespProfessor> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<ProdutoRespProfessor> superPromocao = p -> p.getDesconto() >= 0.30;
        Predicate<ProdutoRespProfessor> freteGratis = p -> p.getValorFrete() == 0;
        Predicate<ProdutoRespProfessor> precoRelevante = p -> p.getPreco() >= 500;

        Function<ProdutoRespProfessor, String> chamadaPromocional =
                p -> "Aproveite! " + p.getNome() + " por " + p.getPreco();

        produtos.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .filter(precoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);

    }
}

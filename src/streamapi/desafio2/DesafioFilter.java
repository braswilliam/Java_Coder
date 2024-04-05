package streamapi.desafio2;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ProdutoDois p1 = new ProdutoDois("Laptop", 2900.00, true, 0.0);
        ProdutoDois p2 = new ProdutoDois("Tablet", 1900.00, false, 19.0);
        ProdutoDois p3 = new ProdutoDois("Eletrola", 1200.00, true, 0.0);
        ProdutoDois p4 = new ProdutoDois("Celular", 2000.00, false, 40.0);
        ProdutoDois p5 = new ProdutoDois("Video Game", 4500.00, true, 0.0);
        ProdutoDois p6 = new ProdutoDois("Teclado", 200.00, true, 50.0);


        List<ProdutoDois> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        //filtrar produtos que estão com desconto e frete grátis:
        Predicate<ProdutoDois> temDesconto = ProdutoDois::getPromocional;
        Predicate<ProdutoDois> freteGratis = p -> p.getFrete() == 0;
        Function<ProdutoDois, String> resultFormatado = p -> "Cliente com desconto e frete gratis: " + p.getNome();

        produtos.stream()
                .filter(temDesconto)
                .filter(freteGratis)
                .map(resultFormatado)
                .forEach(System.out::println);




    }
}

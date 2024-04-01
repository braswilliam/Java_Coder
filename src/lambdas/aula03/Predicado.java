package lambdas.aula03;

import java.util.Locale;
import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //produto será caro se o seu valor for maior ou igual a 750.00:
        Predicate<Produto> iscaro =
                prod -> (prod.getPreco() * (1 - prod.getDesconto())) >= 750.00;

        Produto produto = new Produto("Notebook",3893.89, 0.85);
        System.out.println(iscaro.test(produto));



    }



}

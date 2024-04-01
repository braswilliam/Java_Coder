package lambdas.aula03;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maiDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int result1 = maiDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);


        int result2 = aoQuadrado
                .compose(vezesDois)
                .compose(maiDois)
                .apply(0);

        System.out.println(result1);
        System.out.println(result2);

    }
}

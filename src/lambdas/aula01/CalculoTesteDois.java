package lambdas.aula01;

import java.util.function.BinaryOperator;

public class CalculoTesteDois {


    public static void main(String[] args) {


        BinaryOperator<Double> calc = (x, y) -> x + y;
        System.out.println(calc.apply(2.0,3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0,3.0));



    }


}

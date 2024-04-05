package streamapi.aula03;

import java.util.function.UnaryOperator;

public class Utilitario {

    private Utilitario() {
    }

   public final static UnaryOperator<String> maiucula = n -> n.toUpperCase();
   public final static UnaryOperator<String> primeraLetra = n -> n.charAt(0) + "";

   public static String grito(String n) {
        return n + "!!!";
   }

}

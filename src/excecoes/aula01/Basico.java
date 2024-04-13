package excecoes.aula01;

import java.util.function.Consumer;

public class Basico {
    public static void main(String[] args) {

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Deu B.O no código: " + e.getMessage());
        } finally {
            System.out.println("Fim");
        }


    }
}

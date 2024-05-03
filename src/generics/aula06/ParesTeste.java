package generics.aula06;

public class ParesTeste {
    public static void main(String[] args) {


        Pares<Integer, String> resultadoCocurso = new Pares<>();
        resultadoCocurso.adicionar(1, "Maria");
        resultadoCocurso.adicionar(2, "Pedro");
        resultadoCocurso.adicionar(3, "Gui");
        resultadoCocurso.adicionar(4, "Ana");
        resultadoCocurso.adicionar(2, "Rebeca");

        System.out.println(resultadoCocurso.getValor(2));


    }
}

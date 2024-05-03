package generics.aula04;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        //caixa numero extends Numero que é mais de int, double e float.
        CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
        caixaA.guardar(2.4);
        System.out.println(caixaA.abrir());

    }
}

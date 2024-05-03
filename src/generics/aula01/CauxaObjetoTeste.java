package generics.aula01;

public class CauxaObjetoTeste {
    public static void main(String[] args) {


        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.aguardar(2.3); // autoBox: double -> Double;

        Double coisaA = (Double) caixaA.abrir();
        System.out.println(coisaA);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaA.aguardar("Olá");

        String coisaB = (String) caixaA.abrir();
        System.out.println(coisaB);

    }
}

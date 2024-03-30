package lambdas.aula01;

public class calcTeste {
    public static void main(String[] args) {


        Calculo calculo = new Somar();
        System.out.println( calculo.executar(20, 30));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(2, 8));



    }
}

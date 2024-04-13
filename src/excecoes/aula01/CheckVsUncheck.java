package excecoes.aula01;

import java.lang.reflect.Executable;

public class CheckVsUncheck {

    public static void main(String[] args) {
        try {
            gerarErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        gerarErro2();
        System.out.println("Fim :)");

    }

    //Uma exceção NÃO checada ou NÃO verificada
    static void gerarErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }


    //Exceção checada ou verificada:
    static void gerarErro2()  {
       try {
           throw new Exception("Ocorreu um erro bem legal #02!");
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }



}

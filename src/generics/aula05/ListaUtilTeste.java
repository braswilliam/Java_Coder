package generics.aula05;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {


        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++" );
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLinguagem = (String) ListaUtil.getultomo1(langs);
        System.out.println(ultimaLinguagem);
        int ultimoNumero = (int) ListaUtil.getultomo1(nums);
        System.out.println(ultimoNumero);

        System.out.println("--------------------------//--------------------------");

        //não precisa efetuar o cast:
        ultimaLinguagem =  ListaUtil.getultomo2(langs);
        System.out.println(ultimaLinguagem);
        ultimoNumero = ListaUtil.getultomo2(nums);
        System.out.println(ultimoNumero);





    }
}

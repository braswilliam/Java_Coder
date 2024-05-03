package generics.aula05;

import java.util.List;

public class ListaUtil {

    public static Object getultomo1(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    //Um tipo T que retorna um object do tipo T de uma lista do tipo T;
    public static <T> T getultomo2(List<T> lista) {
        return lista.getLast(); //mesma coisa que o de cima.
    }



}

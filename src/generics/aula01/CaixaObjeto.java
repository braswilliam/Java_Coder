package generics.aula01;

public class CaixaObjeto {

    private Object coisa;

    public void aguardar(Object coisa) {
        this.coisa = coisa;
    }

    public Object abrir() {
        return this.coisa;
    }

}
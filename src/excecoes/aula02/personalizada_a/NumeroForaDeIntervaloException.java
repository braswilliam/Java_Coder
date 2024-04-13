package excecoes.aula02.personalizada_a;

public class NumeroForaDeIntervaloException extends RuntimeException{

    private String nomeDoAtributo;

    public NumeroForaDeIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }


    @Override
    public String getMessage() {
        return String.format("O atributo '%s' está fora de intervalo", nomeDoAtributo);
    }

}

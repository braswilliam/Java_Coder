package edu.william.lambdas.ex1;

public class Main {

    public static void main(String[] args) {


        Nome nome1 = (nome, sobrenome) -> {return nome + sobrenome;};
        System.out.println(nome1.escrever("Quentin ", "Tarantino"));


    }




}

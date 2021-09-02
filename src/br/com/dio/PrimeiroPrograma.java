package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        Livro livro1 = new Livro( "O problema", 300);
        System.out.println(livro1);
        /*
        int a = 5;
        int b = 3;
        System.out.println("hello World!" + (a+b));*/
    }
}

class Livro {
    private  String nome;
    private Integer numPagina;

    public Livro(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;
    }
}
package org.example;

public class Empresario {
    private String nome;
    private long cnpj;

    public Empresario(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    private String getNome() {
        return nome;
    }

    private long getCnpj() {
        return cnpj;
    }
}

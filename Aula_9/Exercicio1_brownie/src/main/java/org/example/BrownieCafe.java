package org.example;

public class BrownieCafe extends Brownie {
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    void adicionaCafe(){
        System.out.println("Adicionando mais café no: " +super.nome);
    }
}

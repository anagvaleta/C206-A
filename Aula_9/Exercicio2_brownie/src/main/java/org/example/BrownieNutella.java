package org.example;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    void adicionaNutella(){
        System.out.println("Adicionando mais nutella no: " +super.nome);
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie nutella sendo adicionado");
    }
}

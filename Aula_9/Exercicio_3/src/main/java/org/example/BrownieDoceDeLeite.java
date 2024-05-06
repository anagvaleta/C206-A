package org.example;

public class BrownieDoceDeLeite extends Brownie{
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    void adicionaDoceDeLeite (){
        System.out.println("Adicionando mais doce de leite no: " +super.nome);
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie doce de leite sendo adicionado");
    }
}

package org.example;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    void addCarrinhoDeCompras(){
        System.out.println("Adicionando no carrinho um: " +nome);;
    }

    void calculaValorTotalCompra(){
        System.out.println("Valor total da compra: " +preco);
    }

    void mostraInfo (){
        System.out.println("Nome dos produtos: " +nome);
        System.out.println("Preco dos produtos: " +preco);
        System.out.println("Sabor dos produtos: " +sabor);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getSabor() {
        return sabor;
    }


}

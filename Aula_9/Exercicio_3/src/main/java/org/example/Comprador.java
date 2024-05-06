package org.example;

public class Comprador {
    private String nome;
    private double saldo;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void efetuarCompra (Brownie brownie){
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        System.out.println("Comprador comprou o brownie "+ brownie.getNome());
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {

        BrownieNutella brownieNutella = new BrownieNutella("Brownie de Nutella", 70, "Nutella");
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("Brownie Doce de Leite", 15, "Doce de leite");
        BrownieCafe brownieCafe = new BrownieCafe("Brownie de Café", 10, "Café");

        brownieNutella.addCarrinhoDeCompras();
        brownieDoceDeLeite.addCarrinhoDeCompras();
        brownieCafe.addCarrinhoDeCompras();
    }
}
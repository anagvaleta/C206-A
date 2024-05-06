package org.example;

public class Main {
    public static void main(String[] args) {

        BrownieNutella brownieNutella = new BrownieNutella("Brownie de Nutella", 70, "Nutella");
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("Brownie Doce de Leite", 15, "Doce de leite");
        BrownieCafe brownieCafe = new BrownieCafe("Brownie de Café", 10, "Café");

        Comprador comprador = new Comprador();
        comprador.setNome("Ana");
        comprador.setSaldo(1000.00);

        comprador.efetuarCompra(brownieNutella);
        comprador.efetuarCompra(brownieDoceDeLeite);
        comprador.efetuarCompra(brownieCafe);
    }
}
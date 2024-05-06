package org.example;

public class Main {
    public static void main(String[] args) {

        BrownieNutella brownieNutella = new BrownieNutella("Brownie de Nutella", 70, "Nutella");
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("Brownie Doce de Leite", 15, "Doce de leite");
        BrownieCafe brownieCafe = new BrownieCafe("Brownie de Café", 10, "Café");

        //colocar adicionais
        brownieNutella.adicionaNutella();
        System.out.println(" ");
        brownieCafe.adicionaCafe();
        System.out.println(" ");
        brownieDoceDeLeite.adicionaDoceDeLeite();

        //mostrar infos
        brownieNutella.mostraInfo();
        System.out.println(" ");
        brownieCafe.mostraInfo();
        System.out.println(" ");
        brownieDoceDeLeite.mostraInfo();
        System.out.println(" ");

        //adicioanar e calcular valor total
        brownieNutella.addCarrinhoDeCompras();
        brownieNutella.calculaValorTotalCompra();
        System.out.println(" ");
        brownieDoceDeLeite.addCarrinhoDeCompras();
        brownieDoceDeLeite.calculaValorTotalCompra();
    }
}
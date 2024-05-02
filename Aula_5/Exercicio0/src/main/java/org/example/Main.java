package org.example;

public class Main {
    public static void main(String[] args) {

    Cantina cantina = new Cantina("Cantina 1");

    Salgado salgado_1 = new Salgado("Bolinha de quejo");
    Salgado salgado_2 = new Salgado("Coxinha");
    Salgado salgado_3 = new Salgado("Pastel");

    cantina.addSalgados(salgado_1);
    cantina.addSalgados(salgado_2);
    cantina.addSalgados(salgado_3);

    cantina.mostraInfo();
    }
}
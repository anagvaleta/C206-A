package org.example;

public class Carro {
    String modelo;
    String cor;
    boolean alugado;
    Motor motores;

    public Carro(String modelo, String cor, boolean alugado) {
        this.modelo = modelo;
        this.cor = cor;
        this.alugado = alugado;
    }


    void mostraInfo (){
        System.out.println("Modelo: " +modelo);
        System.out.println("Cor: " +cor);
        System.out.println("Alugado: " +alugado);
        motores.mostraInfo();
    }
}

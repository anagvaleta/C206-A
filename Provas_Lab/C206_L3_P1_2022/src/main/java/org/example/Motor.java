package org.example;

public class Motor {
    float velocidadeMaxima;

    public Motor(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    void mostraInfo (){
        System.out.println("Velocidade máxima: " +velocidadeMaxima);
    }
}

package org.example;
public class Zumbi {
    double vida;
    String nome;

    double mostravida(){
        return vida;
    }

    void transfereVida (Zumbi zumbiAlvo, double quantia){
        vida = -quantia;
        zumbiAlvo.vida = +quantia;
    }
}

package org.example;

public class Zumbi {
        double vida;

        double mostravida(){
            return vida;
        }

        void transfereVida (org.example.Zumbi zumbiAlvo, double quantia){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
        }
    }

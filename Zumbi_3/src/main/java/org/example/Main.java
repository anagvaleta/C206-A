package org.example;

public class Main {
    public static void main(String[] args) {
        //criando os zumbis
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        //colocando a vida
        z1.vida = 100;
        z2.vida = 200;

        //tornando as refs de variaveis iguais
        z1 = z2;

        //verificando vidas
        System.out.println("Vida do Zumbi 2: " + z1.vida);
        System.out.println("Vida do Zumbi 1: " + z2.vida);
    }
}
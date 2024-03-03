package org.example;

public class Main {
    public static void main(String[] args) {
        //criando os zumbis
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        //colocando a vida
        z1.vida = 100;
        z2.vida = 200;

        //verificando vidas
        if (z1.transfereVida(z2, 50)){
            System.out.println("Vida do Zumbi 1: " +z1.vida);
            System.out.println("Vida do Zumbi 2: " +z2.vida);
        }
        if (z1.transfereVida(z2, 150)) {
            System.out.println("Vida do zumbi 1: " +z1.vida);
            System.out.println("Vida do zumbi 2: " +z2.vida);
        } else
            System.out.println("A vida não foi alterada");
    }
}
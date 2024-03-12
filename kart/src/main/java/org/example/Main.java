package org.example;

public class Main {
    public static void main(String[] args) {
       Piloto piloto1 = new Piloto();
       piloto1.nome = "Ana";

       Piloto piloto2 = new Piloto();
       piloto2.nome = "Petteco";

       Kart kart1 = new Kart ();
       kart1.nome = "Kart 1";

       Kart kart2 = new Kart();
       kart2.nome = "Kart 2";

       kart1.piloto = piloto1;
       kart2.piloto = piloto2;

       kart1.motor.cilindradas = "150";
       kart1.motor.velocidademaxima = 100f;
    }

}
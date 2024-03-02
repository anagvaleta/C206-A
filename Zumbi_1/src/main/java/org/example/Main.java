package org.example;

public class Main {
     public static void main (String [] args){
         //utilizar a classe criada anteriormente
         Zumbi zumbi = new Zumbi (); //teoricamente é um ponteiro na memória

         //definir valores
         zumbi.forca = 100;
         zumbi.vida = 200;
         zumbi.altura = 1.50F;
         zumbi.nome = "Ana";

         //utilizar em outra forma
         Zumbi zumbi2 = new Zumbi();
         zumbi2.nome = "Ana";

         System.out.println("O nome do Zumbi é: " +zumbi.nome);
         System.out.println("O nome do Zumbi 2 é: " +zumbi2.nome);

         //chamando as funções criadas
         zumbi.andar();
         zumbi.seAlimentar();
         zumbi.iniciar();

         //vai imprimir a função criada anteriormente
         System.out.println("O nome do Zumbi é: "+zumbi.nome);

         }
     }

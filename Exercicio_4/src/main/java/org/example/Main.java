package org.example;
package java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        int Lanche1 = entrada.nextInt();
        int Lanche2 = entrada.nextInt();
        int Lanche3 = entrada.nextInt();
        entrada.close();

        int resultado = (Lanche1 + Lanche2 + Lanche3);
        int media = (resultado)/2;

        System.out.println("O total de lanches consumidos foram de: " +resultado);
        System.out.println("A media de lanches foi de: " +media);
    }
}
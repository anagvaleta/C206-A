package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String modelo;
        String cor;
        boolean alugado;
        Motor motor;
        float velocidadeMaxima;


        Locadora l1 = new Locadora("Carros Max", "1234","Rua Redbull 2234", 10);
        Scanner sc = new Scanner(System.in);

        int op;
        boolean flag=true;

        while (flag){
            op = sc.nextInt();
            sc.nextLine();

            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1: Adicionar um carro na locadora");
            System.out.println("2: Mostrar as informações da locadora e seus carros");
            System.out.println("3: % Dos carros disponivéis para alugar");
            System.out.println("4: Alugar um carro");
            System.out.println("5: Sair");
            System.out.println("--------------------------------------------------");

            switch (op){
                case 1:
                    System.out.println("Digite o modelo: ");
                    modelo = sc.nextLine();

                    System.out.println("Digite a cor: ");
                    cor = sc.nextLine();

                    System.out.println("Alugado (sim - true / não - false): ");
                    alugado = sc.hasNext();

                    System.out.println("Velocidade máxima do motor: ");
                    velocidadeMaxima = sc.nextFloat();

                    Motor m1 = new Motor(velocidadeMaxima);
                    Carro c1 = new Carro(modelo, cor, alugado);
                    break;

                case 2:
                    l1.mostraInfo();
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }
    }
}
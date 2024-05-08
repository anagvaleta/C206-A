package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Plataforma p1 = new Plataforma("Steamaina", "Ana Luisa");

        String nome;
        String genero;
        double preco;
        boolean dlc;

        System.out.println("Bem vindo a plataforma da capitã: " + p1.nome);
        System.out.println();

        boolean flag = true;
        int op;

        while(flag){
            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1: Adicionar um jogo na plataforma");
            System.out.println("2: Mostrar informações da plataforma e jogos");
            System.out.println("3: Mostrar o nome do jogo mais caro e mais barato cadastrado");
            System.out.println("4: Mostrar quantos jogos possuem DLC");
            System.out.println("5: Sair");
            System.out.println("--------------------------------------------------");

            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Digite o nome do jogo: ");
                    nome = sc.nextLine();

                    System.out.println("Digite o genero do jogo: ");
                    genero = sc.nextLine();

                    System.out.println("Digite o valor do jogo: ");
                    preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite se o jogo possui DLC (sim - true / não - false): ");
                    dlc = sc.nextBoolean();
                    sc.nextLine();

                    Jogo jogo = new Jogo (nome, genero, preco, dlc);
                    p1.adicionarJogo(jogo);
                    break;

                case 2:
                    p1.mostraInfo();
                    break;

                case 3:
                    p1.mostraMaisCaroBarato();
                    break;

                case 4:
                    p1.calculaDlc();
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Opção inválida. Selecione uma opção de 1 a 4 ou 5 para sair do menu.");
            }

        }
    }
}
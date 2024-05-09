package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;
        String titulo;
        String ranking;

        Aldeia a1 = new Aldeia("SRS", 1000, "Sul de minas");
        Scanner sc = new Scanner(System.in);

        int op;
        boolean flag=true;

        while(flag){
            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1: Adicionar um ninja na Aldeia");
            System.out.println("2: Mostrar as informações da Aldeia e seus Ninjas");
            System.out.println("3: Mostrar os nomes dos Ninjas classificados no ranking S");
            System.out.println("4: Mostrar a quantidade de ninjas Gennin, Chunnin e ANBU");
            System.out.println("5: Sair");
            System.out.println("--------------------------------------------------");

            op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("Digite o nome do Ninja: ");
                    nome = sc.nextLine();

                    System.out.println("Digite a idade do Ninja: ");
                    idade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o titulo do Ninja (Gennin, Chunnin ou ANBU):");
                    titulo = sc.nextLine();

                    System.out.println("Digite o ranking do Ninja (S, A, B, C, D): ");
                    ranking = sc.nextLine();

                    Ninja n1 = new Ninja(nome, idade, titulo, ranking);
                    a1.adicionarNinja(n1);
                    break;

                case 2:
                    a1.mostraInfo();
                    break;
                case 3:
                    a1.rankingS();
                    break;
                case 4:
                    a1.qtdTitulos();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida, selecione uma opção de 1 à 4 ou 5 para sair.");
            }
        }
    }
}
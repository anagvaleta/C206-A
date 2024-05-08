package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Equipe e1 = new Equipe("Ana Luisa");

        String nome;
        float poder;
        boolean podeVoar;
        int a=0, b=0;

        System.out.println("Bem vindo a equipe da capitã: " + e1.capitao);
        System.out.println();

        boolean flag = true;
        int op;

        while (flag){
            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1: Adicionar um novo herói.");
            System.out.println("2: Mostrar informações da equipe e heróis.");
            System.out.println("3: Mostrar o herói mais forte de acordo com seu poder.");
            System.out.println("4: Calcular a porcentagem de heróis que podem voar.");
            System.out.println("--------------------------------------------------");

            op = input.nextInt();
            input.nextLine();

            switch (op){
                case 1:
                    System.out.print("Nome do herói: ");
                    nome = input.nextLine();

                    System.out.print("Poder do herói: ");
                    poder = input.nextFloat();
                    input.nextLine(); // consume a nova linha

                    System.out.print("O herói pode voar (true/false): ");
                    podeVoar = input.nextBoolean();
                    input.nextLine();  //consume a nova linha


                    Heroi heroi = new Heroi(nome, poder, podeVoar);
                    e1.adicionarHeroi(heroi);
                    break;

                case 2:
                    e1.mostraInfo();
                    break;

                case 3:
                    e1.mostraMaisForte();
                    break;

                case 4:
                    System.out.println("A porcentagem de heróis que podem voar é de: " +e1.calculaVoadores() +"%");
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida. Selecione números de 1 à 4 ou 5 para sair.");
            }
            }

    }
}
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        int poder;
        String classificacao;

        Deck d1 = new Deck("Ana Luisa");

        int op=0;
        boolean flag = true;

        while (flag){

            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1: Adicionar uma carta ao deck");
            System.out.println("2: Mostrar informações do deck e suas cartas");
            System.out.println("3: Mostrar o poder total do deck e sua média aritmética");
            System.out.println("4: Calcular quantos soldados, arqueiros e pesados há no deck.");
            System.out.println("5: Sair");
            System.out.println("--------------------------------------------------");

            System.out.println("Digite uma opção de 1 à 5: ");
            op = input.nextInt();
            input.nextLine();

            switch (op){
             case 1:
                 System.out.println("Digite o nome da carta: ");
                 nome = input.nextLine();

                 System.out.println("Digite a quantidade de poder: ");
                 poder = input.nextInt();
                 input.nextLine();

                 System.out.println("Digite a classificação da carta: ");
                 classificacao = input.nextLine();

                Carta carta = new Carta(nome, poder, classificacao);
                d1.adicionarCarta(carta);
                break;

            case 2:
                d1.mostraInfo();
                break;

            case 3:
                d1.calculaPoderMedio();
                break;

            case 4:
                d1.calculaClassificacao();
                break;

            case 5:
                flag = false;
                break;

                default:
                    System.out.println("Opção inválida. Selecione as opções de 1 à 4 ou 5 para sair.");
            }
        }
    }
}
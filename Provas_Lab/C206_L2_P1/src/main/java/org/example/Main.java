package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        double nota;
        int temporadas;
        boolean finalizada;

        Plataforma p1 = new Plataforma("Netflix");
        Scanner sc = new Scanner(System.in);

        boolean flag=true;
        int op=0;


        while (flag){
            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1: Adicionar uma série na plataforma");
            System.out.println("2: Mostrar informações da plataforma e suas séries");
            System.out.println("3: Mostrar o nome da maior série já finalizada");
            System.out.println("4: A porcentagem do número de séries e a média aritmética de notas das que possuem 3 ou mais temporadas.");
            System.out.println("5: Sair");
            System.out.println("--------------------------------------------------");

            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Nome: ");
                    nome = sc.nextLine();

                    System.out.println("Nota: ");
                    nota = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Número de temporadas: ");
                    temporadas = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Série finalizada (sim - true / não - false): ");
                    finalizada = sc.hasNext();
                    sc.nextLine();

                    Serie s1 = new Serie(nome, nota, temporadas, finalizada);
                    p1.addSerie(s1);
                    break;

                case 2:
                    p1.mostraInfo();
                    break;

                case 3:
                    p1.serieMaisLongaFinalizada();
                    break;

                case 4:
                    p1.mediaPorcentagem();
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }

    }
}
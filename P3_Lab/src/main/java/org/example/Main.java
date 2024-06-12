package org.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import static org.example.Aluno.criarAluno;

public class Main {
    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();
        Arquivo arquivo = new Arquivo();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("---------MENU--------------------");
            System.out.println("1 - Salvar aluno");
            System.out.println("2 - Mostrar alunos");
            System.out.println("3 - Ordenar alunos por média");
            System.out.println("4 - Mostrar quantidade de alunos por curso");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    try {
                        Aluno aluno = criarAluno(scanner);
                        alunos.add(aluno);
                        arquivo.escrever(aluno);
                        System.out.println("Aluno salvo!");
                    } catch (InfoInvalidaException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Alunos cadastrados: ");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno foi cadastrado ainda");
                    } else {
                        for (Aluno aluno : alunos) {
                            System.out.println(aluno);
                        }
                    }
                    break;
                case 3:
                    alunos = arquivo.ler();
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno foi cadastrado ainda.");
                    } else {
                        alunos.sort(Comparator.comparingDouble(Aluno::getMedia));
                        System.out.println("Alunos ordenados por média: ");
                        for (Aluno aluno : alunos) {
                            System.out.println(aluno);
                        }
                    }
                    break;
                case 4:
                    alunos = arquivo.ler();
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno foi cadastrado ainda.");
                    } else {
                        System.out.println("Quantidade de alunos por curso: ");
                        for (Curso curso : Curso.values()) {
                            int count = 0;
                            for (Aluno aluno : alunos) {
                                if (aluno.getCurso().equals(curso)) {
                                    count++;
                                    System.out.println(curso + ": " + count);
                                }
                            }
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida! Escolha uma opção de 1 à 5.");
            }
        } while (opcao != 0);
    }
}
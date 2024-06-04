package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Ordenar clientes por nome (alfabética)");
            System.out.println("4. Ordenar clientes por nome (reversa)");
            System.out.println("5. Sair");
            System.out.print("Digite a opção desejada: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner

                    Cliente cliente = new Cliente(nome, cpf, endereco, idade);
                    arquivo.escrever(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;
                case 2:
                    ArrayList<Cliente> clientes = arquivo.ler();
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        System.out.println("\nClientes:");
                        for (Cliente c : clientes) {
                            System.out.println("Nome: " + c.nome);
                            System.out.println("CPF: " + c.cpf);
                            System.out.println("Endereço: " + c.endereco);
                            System.out.println("Idade: " + c.idade);
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 3:
                    clientes = arquivo.ler();
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        Collections.sort(clientes, (c1, c2) -> c1.nome.compareToIgnoreCase(c2.nome));
                        System.out.println("\nClientes ordenados por nome (alfabética):");
                        for (Cliente c : clientes) {
                            System.out.println("Nome: " + c.nome);
                            System.out.println("CPF: " + c.cpf);
                            System.out.println("Endereço: " + c.endereco);
                            System.out.println("Idade: " + c.idade);
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 4:
                    clientes = arquivo.ler();
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        Collections.sort(clientes, (c1, c2) -> c2.nome.compareToIgnoreCase(c1.nome));
                        System.out.println("\nClientes ordenados por nome (reversa):");
                        for (Cliente c : clientes) {
                            System.out.println("Nome: " + c.nome);
                            System.out.println("CPF: " + c.cpf);
                            System.out.println("Endereço: " + c.endereco);
                            System.out.println("Idade: " + c.idade);
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    private Curso curso;
    private float media;

    public Aluno(String nome, int matricula, Curso curso, float media) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public float getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Curso: " + curso + ", Média: " + media;
    }

    static Aluno criarAluno(Scanner scanner) throws InfoInvalidaException {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();
        if (matricula <= 0) {
            throw new InfoInvalidaException("Matrícula inválida. Deve ser maior que zero.");
        }
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Digite o curso do aluno: ");
        String cursoStr = scanner.nextLine();
        Curso curso = Curso.valueOf(cursoStr.toUpperCase());

        System.out.print("Digite a média do aluno: ");
        float media = scanner.nextFloat();
        scanner.nextLine(); // Limpa o buffer do scanner

        return new Aluno(nome, matricula, curso, media);
    }
}



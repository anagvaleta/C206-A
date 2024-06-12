package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Arquivo {
    private String arquivoTxt = "alunos.txt";

    public void escrever(Aluno aluno) {
        try (PrintWriter writer = new PrintWriter(new File(arquivoTxt))) {
            writer.println(aluno.getNome() + "," + aluno.getMatricula() + "," + aluno.getCurso() + "," + aluno.getMedia());
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    public ArrayList<Aluno> ler() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        try (Scanner reader = new Scanner(new File(arquivoTxt))) {
            while (reader.hasNextLine()) {
                String linha = reader.nextLine();
                String[] dados = linha.split(",");
                String nome = dados[0];
                int matricula = Integer.parseInt(dados[1]);
                Curso curso = Curso.valueOf(dados[2].toUpperCase());
                float media = Float.parseFloat(dados[3]);
                alunos.add(new Aluno(nome, matricula, curso, media));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return alunos;
    }
}

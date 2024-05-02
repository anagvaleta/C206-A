package org.example;

public class Cantina {
    String nome;

    //nome do array sempre no plural
    Salgado [] salgados = new Salgado [3];

    void addSalgado (Salgado novoSalgado){
        for (int i = 0; i < salgados.length; i++) { //usar length para independente do tamanho mudar automaticamente
            salgados [i] = novoSalgado; //mandar o salgado para preencher o array
        }
    }

    void mostraInfo (){
        for (Salgado salgado : salgados){
            System.out.println(salgado);
        }
    }
}

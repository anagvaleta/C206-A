package org.example;

public class Plataforma {
    String nome;
    String criador;
    Jogo [] jogos = new Jogo [10];
    int numJogos = 0; //iniciar o numero de jogos

    public Plataforma(String nome, String criador) {
        this.nome = nome;
        this.criador = criador;
    }

    void mostraInfo (){
        System.out.println("Nome da plataforma: " +nome);
        System.out.println("Criador (a) da plataforma: " +criador);

        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i]!= null){
                System.out.println("Nome: " +jogos[i].nome);
                System.out.println("Genero: " +jogos[i].genero);
                System.out.println("Valor: " +jogos[i].preco);
                System.out.println("Possui dlc: " +jogos[i].dlc);
            }
        }
    }

    void adicionarJogo(Jogo jogo){
        if (numJogos < jogos.length){
            jogos [numJogos] = jogo;
            numJogos++;
        } else
            System.out.println("Plataforma cheia, não é possível adicionar mais jogos!");
    }

    void mostraMaisCaroBarato(){
        double maiorpreco = 0;
        String caro = "";

        double menorpreco = 1000;
        String barato = "";

        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null){
                if (jogos[i].preco > maiorpreco){
                    caro = jogos[i].nome;
                    maiorpreco = jogos[i].preco;
                }
                if (jogos[i].preco < menorpreco){
                    barato = jogos[i].nome;
                    menorpreco = jogos[i].preco;
                }
            }
        }
        System.out.println("O jogo mais caro é: " +caro +" de valor: " +maiorpreco +" reais");
        System.out.println("O jogo mais barato é: " +barato +" de valor: " +menorpreco +" reais");

    }

    void calculaDlc(){
        int a=0;
        int b=0;

        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null) {
                if (jogos[i].dlc == true) {
                    a++;
                }
            }
        }

        System.out.println("Quantidade de jogos que possuem DLC: " +a);
    }
}

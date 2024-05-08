package org.example;

public class Equipe {
    String capitao;
    Heroi [] herois = new Heroi[10];
    int numHerois = 0; // iniciar o numero de herois

    public Equipe(String capitao) {
        this.capitao = capitao;
    }

    void adicionarHeroi (Heroi heroi){
        if (numHerois < herois.length) {
            herois[numHerois] = heroi;
            numHerois++;
        } else {
            System.out.println("Equipe cheia! Não é possível adicionar mais heróis.");
        }
    }

    void mostraInfo(){
        System.out.println("Capitao: " +capitao);
        for (int i = 0; i < numHerois; i++) {
            if (herois[i]!= null){
                System.out.println("Nome: " +herois[i].nome);
                System.out.println("Poder: " +herois[i].poder);
                System.out.println("Pode voar? " +herois[i].podeVoar);
            }
        }
    }
    void mostraMaisForte(){
        float maiorPoder = 0;
        String maisForte = "";

        for (int i = 0; i < herois.length; i++) {
            if (herois[i]!=null){
                if (herois[i].poder > maiorPoder) {
                    maisForte = herois[i].nome;
                    maiorPoder = herois[i].poder;
                }
            }
        }
        System.out.println("O herói de maior poder é: " +maisForte);
    }
    int calculaVoadores (){
        int a=0;
        int b=0;
        int c=0;

        for (int i = 0; i < herois.length; i++) {
            if (herois[i]!= null){
            if (herois[i].podeVoar == true){
                a++;
            } else
                b++;
        }
        if (a>b){
            c = (100*a)/numHerois;
        }
        }
    return c;
    }

}

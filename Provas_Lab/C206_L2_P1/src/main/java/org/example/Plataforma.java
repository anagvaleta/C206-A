package org.example;

public class Plataforma {
    String nome;
    Serie [] series = new Serie[10];
    int numSeries = 0; //iniciar o numero de series

    public Plataforma(String nome) {
        this.nome = nome;
    }

    void mostraInfo(){
        System.out.println("Nome da plataforma: " +nome);
            for (int i = 0; i < series.length; i++) {
                if (series[i]!= null) {
                System.out.println("Nome: " + series[i].nome);
                System.out.println("Nota: " + series[i].temporadas);
                System.out.println("Temporadas: " + series[i].temporadas);
                System.out.println("Finalizada: " + series[i].finalizada);
            }
        }
    }

    void addSerie (Serie serie){
            // checar se cabe na array
            if (numSeries < series.length){
                // adicionar a série a array e incrementar o numero de séries
                series [numSeries] = serie;
                numSeries++;
            } else
                System.out.println("Plataforma cheia, não foi possível adicionar mais séries.");
    }

    String serieMaisLongaFinalizada (){
        int maior=0;
        String nomeMaior ="";

        for (int i = 0; i < numSeries; i++) {
            if (series[i]!=null){
                if (series[i].finalizada == true && series[i].temporadas>maior){
                    maior = series[i].temporadas;
                    nomeMaior = series[i].nome;
                    System.out.println("A maior série finalizada foi: " +nomeMaior);
                }
            }
        }
        return nomeMaior;
    }

    void mediaPorcentagem(){
        int a=0;
        double b=0;
        int cont=0;

        for (int i = 0; i < series.length; i++) {
            if (series[i] != null){
                if (series[i].temporadas > 3) {
                    a++;
                    b += series[i].nota;
                    cont++;
                }
            }
        }

        int c = a/(numSeries*100);
        double d = b/cont;

        System.out.println("A porcentagem das séries finalidas com mais de 3 temporadas é: " +c);
        System.out.println("A média aritmética das notas é: " +d);
    }
}

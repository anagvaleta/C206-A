package org.example;

public class Deck {
    String dono;
    Carta [] cartas = new Carta[10];
    int numCartas =0;

    public Deck(String dono) {
        this.dono = dono;
    }

    void adicionarCarta (Carta carta){
        if (numCartas < cartas.length){
            cartas [numCartas] = carta;
            numCartas++;
        } else
            System.out.println("Plataforma cheia, não é possível adicionar mais jogos!");
    }

    void mostraInfo(){
        System.out.println("Dona do deck: " +dono);
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i]!=null){
                System.out.println("Nome da carta: " +cartas[i].nome);
                System.out.println("Poder da carta: "+cartas[i].poder);
                System.out.println("Classificação da carta: " +cartas[i].classificacao);
            }
        }
    }
    void calculaPoderMedio (){
        int a=0;
        int b;
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i]!=null){
                a += cartas[i].poder;
            }
        }
        System.out.println("Poder total do deck: " +a);
     b = a/numCartas;
        System.out.println("Média aritmética: " +b);
    }

    void calculaClassificacao (){
        int a=0,b=0,c=0;

        for (int i = 0; i < cartas.length; i++) {
         if (cartas[i] !=null){
             switch (cartas[i].classificacao) {
                 case "soldado":
                     a++;
                     break;
                 case "arqueiro":
                     b++;
                     break;
                 case "pesado":
                     c++;
                     break;
             }
         }
        }
        System.out.println("Soldados: " +a);
        System.out.println("Arqueiros " +b);
        System.out.println("Pesado: " +c);
    }

}

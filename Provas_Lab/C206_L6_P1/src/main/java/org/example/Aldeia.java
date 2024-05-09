package org.example;

public class Aldeia {
    String nome;
    int qtdMoradores;
    String regiao;
    Ninja [] ninjas = new Ninja[10];
    int numNinjas = 0;

    public Aldeia(String nome, int qtdMoradores, String regiao) {
        this.nome = nome;
        this.qtdMoradores = qtdMoradores;
        this.regiao = regiao;
    }

    void adicionarNinja (Ninja ninja){
        if (numNinjas < ninjas.length) {
            ninjas [numNinjas] = ninja;
            numNinjas++;
        } else
            System.out.println("Aldeia cheia.");
    }

    void mostraInfo (){
        System.out.println("Nome da aldeia: " +nome);
        System.out.println("Quantidade de moradores: " +qtdMoradores);
        System.out.println("Região: " +regiao);
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] !=null){
                ninjas[i].mostraInfo();
                System.out.println("--------------------------------------------------");
            }
        }
    }

    void rankingS (){
        int a = 0;
        String nome = "";
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null) {
                switch (ninjas[i].ranking) {
                    case "S":
                        a++;
                        nome = ninjas[i].nome;
                        System.out.println("Nome do Ninja no ranking S: " + nome);
                        break;
                    case "s":
                        a++;
                        nome = ninjas[i].nome;
                        System.out.println("Nome do Ninja no ranking S: " + nome);
                        break;
                }
            }
        }

        System.out.println("Número de Ninjas no ranking S: " +a);
        System.out.println();
    }

    void qtdTitulos (){
        int a=0, b=0, c=0;

        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != null){
                switch (ninjas[i].titulo){
                    case "Gennin":
                        a++;
                        break;
                    case "Chunnin":
                        b++;
                        break;
                    case "ANBU":
                        c++;
                        break;
                }
            }
        }

        System.out.println("Número de ninjas Gennin: " +a);
        System.out.println("Número de ninjas Chunnin: " +b);
        System.out.println("Número de ninjas ANBU: " +c);
    }
}

package org.example;

public class Locadora {
    String nome;
    String cnpj;
    String endereco;
    int CarrosParaAlugar;


    Carro [] carros = new Carro[10];
    Motor [] motores = new Motor[10];

    public Locadora(String nome, String cnpj, String endereco, int carrosParaAlugar) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        CarrosParaAlugar = carrosParaAlugar;
    }

    void mostraInfo (){
        System.out.println("Nome da locadora: " +nome);
        System.out.println("Cnpj da locadora: " +cnpj);
        System.out.println("Endereço da locadora: " +endereco);

        for (int i = 0; i < carros.length; i++) {
            if (carros[i] !=null){
                carros[i].mostraInfo();
            }
        }
    }

    void adicionarCarro (Carro carro){
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] !=null) {
                carros[i] = carro;
            } else
                System.out.println("Locadora cheia.");
        }
    }

    void alugarCarro (int index){

    }

    float ContarCarrosParaAlugar (){
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] !=null){
               switch (){

               }
            }
        }

        return 0;
    }
}

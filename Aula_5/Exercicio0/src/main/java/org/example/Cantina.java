package org.example;

public class Cantina  {
    String nome;
    //array de salgados
    Salgado [] salgados = new Salgado [5];

    public Cantina(String nome) {
        this.nome = nome;
    }

    void addSalgados(Salgado novoSalgado){
        for(int i = 0; i < salgados.length; i++){ //varrer o array
            if(salgados[i] == null){ //ver se não tem um salgado alocado
                salgados[i] = novoSalgado;
                break; //adiciona e sai do loop
            }
        }
    }
    void mostraInfo(){
        System.out.println("A Cantina: " + nome + " tem os salgados:");
        //varrer o vetor
        for (Salgado salgado : salgados) {
            if(salgado != null) //Verifica se existe salgado
                System.out.println(salgado.nome);
        }
    }
}

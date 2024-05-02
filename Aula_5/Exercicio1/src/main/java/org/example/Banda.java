package org.example;

public class Banda {
    private String nome;
    private String genero;
    Musica [] musicas = new Musica[5];
    Membro [] membros = new Membro[5];
    private Empresario empresario;



    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    void addMusicaNova(Musica novaMusica){
        for (int i = 0; i < musicas.length; i++) {
            if(musicas[i] == null){ //ver se não tem musica alocada
                musicas[i] = novaMusica;
                break; //adiciona e sai do loop
            }
        }
    }

    void addMembroNovo(Membro novoMembro){
        for (int i = 0; i < membros.length; i++) {
            if(membros[i] == null){ //ver se não tem musica alocada
                membros[i] = novoMembro;
                break; //adiciona e sai do loop
            }
        }
    }

    void mostraInfo(){
        System.out.println("A banda: " +getNome() +" de genero: "+getGenero() +" possui os seguintes membros: ");
        for (Membro membro : membros) {
            if (membro != null){
                System.out.println(membro.getNome());
            }
        }
        System.out.println(" E as seguintes musicas: ");
        for (Musica musica : musicas){
            if (musica != null){
                System.out.println(musica.getNome());
            }
        }
    }

    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }
}

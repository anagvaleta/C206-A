package org.example;

public class Main {
    public static void main(String[] args) {

        //criando banda
        Banda banda = new Banda("Paramore", "Indie");
        Empresario empresario = new Empresario("Fulaninho", 234523);

        //criando membros
        Membro membro1 = new Membro("Hayley Williams", "Cantora");
        Membro membro2 = new Membro("Taylor York", "Violão");
        Membro membro3 = new Membro("Zac Farro", "Baterista");
        Membro membro4 = new Membro("Jeremy Davis", "Baixista");
        Membro membro5 = new Membro("Jason Bynum", "Violão");

        //criando musicas
        Musica musica1 = new Musica("The Only Exeption", 3.1);
        Musica musica2 = new Musica("Fake Happy", 3.5);

        //colocando musicas
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);

        //colocando membros
        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);
        banda.addMembroNovo(membro3);
        banda.addMembroNovo(membro4);
        banda.addMembroNovo(membro5);

        banda.mostraInfo();
    }
}
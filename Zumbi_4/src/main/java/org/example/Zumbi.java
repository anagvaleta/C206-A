package org.example;

public class Zumbi {
    double vida;

    double mostravida(){
        return vida;
    }

    boolean transfereVida (org.example.Zumbi zumbiAlvo, double quantia){
        if(vida > quantia ) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;

            return true;
        }
        else
            System.out.println("Não consigo realizar a transferencia pois minha vida é: " +vida);
            return false;
    }
}

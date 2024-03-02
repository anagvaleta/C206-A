import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner num = new Scanner (System.in);
        int num2;
        int x = rand.nextInt(10) + 1; //gera um número entre 10 e 1

        do {
            System.out.println("Digite um numero:");
            num2 = num.nextInt();
            if (num2 != x)
                System.out.println("Errado, tente novamente");
            if (num2 > x){
                System.out.println("O numero digitado eh maior que x");
            } else
                System.out.println("O numero digitado eh menor que x");
        } while(num2 != x);
        System.out.println("Parabens, o numero esta correto!");
    }
}


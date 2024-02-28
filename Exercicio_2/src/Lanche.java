import java.util.Scanner;

public class Lanche { //mesmo nome do arquivo

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o numero de lanches da primeira hora:"); //se for só print não tem quebra de linha
            int lanche1 = entrada.nextInt();
            System.out.println("Digite o numero de lanches da segunda hora:");
            int lanche2 = entrada.nextInt();
            System.out.println("Digite o numero de lanches da terceira hora:");
            int lanche3 = entrada.nextInt();

            int total = lanche1 + lanche2 + lanche3;
            float media = total / 3.0f;

            System.out.println("Total de lanches foi: " + total);
            System.out.println("A media de lanches foi: " + media);

            entrada.close(); //boa prática fechar o canal de entrada
        }
    }
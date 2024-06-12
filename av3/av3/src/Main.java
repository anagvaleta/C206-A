import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Arquivo arquivo = new Arquivo();
    ArrayList<Produto> produtos = new ArrayList<>();

    while (true) {
      System.out.println("Menu:");
      System.out.println("1 - Cadastrar Produto");
      System.out.println("2 - Listar Produtos");
      System.out.println("3 - Ordenar Produtos por Preço");
      System.out.println("4 - Mostrar Quantidade por Tipo");
      System.out.println("5 - Sair");
      System.out.print("Opção: ");

      int opcao = scanner.nextInt();
      scanner.nextLine(); // Consumir a quebra de linha

      switch (opcao) {
        case 1:
          try {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Tipo: ");
            String tipo = scanner.nextLine();

            Produto produto = new Produto(nome, preco, tipo);
            arquivo.escrever(produto);
            System.out.println("Produto cadastrado com sucesso!");
          } catch (InfoInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
          }
          break;
        case 2:
          produtos = arquivo.ler();
          if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
          } else {
            for (Produto produto : produtos) {
              System.out.println(produto);
            }
          }
          break;
        case 3:
          produtos = arquivo.ler();
          if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
          } else {
            Collections.sort(produtos, (p1, p2) -> Double.compare(p2.getPreco(), p1.getPreco()));
            System.out.println("Produtos ordenados por preço:");
            for (Produto produto : produtos) {
              System.out.println(produto);
            }
          }
          break;
        case 4:
          produtos = arquivo.ler();
          if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
          } else {
            for (String tipo : new String[]{"Comida", "Higiene", "Decoração"}) {
              int quantidade = 0;
              for (Produto produto : produtos) {
                if (produto.getTipo().equals(tipo)) {
                  quantidade++;
                }
              }
              System.out.println("Quantidade de produtos do tipo " + tipo + ": " + quantidade);
            }
          }
          break;
        case 5:
          System.out.println("Saindo...");
          scanner.close();
          return;
        default:
          System.out.println("Opção inválida.");
      }
    }
  }
}

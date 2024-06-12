
  import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

  class Produto {
    private String nome;
    private double preco;
    private String tipo;

    public Produto(String nome, double preco, String tipo) {
      this.nome = nome;
      this.preco = preco;
      this.tipo = tipo;
    }

    public String getNome() {
      return nome;
    }

    public double getPreco() {
      return preco;
    }

    public String getTipo() {
      return tipo;
    }

    @Override
    public String toString() {
      return "Nome: " + nome + ", Preço: " + preco + ", Tipo: " + tipo;
    }
  }

import java.util.ArrayList;

public class Arquivo {
  private ArrayList<Produto> produtos;

  public Arquivo() {
    produtos = new ArrayList<>();
  }

  public void escrever(Produto produto) throws InfoInvalidaException {
    if (produto.getPreco() <= 0) {
      throw new InfoInvalidaException("Preço inválido: deve ser maior que zero.");
    }
    if (!produto.getTipo().equals("Comida") && !produto.getTipo().equals("Higiene") && !produto.getTipo().equals("Decoração")) {
      throw new InfoInvalidaException("Tipo inválido: deve ser 'Comida', 'Higiene' ou 'Decoração'.");
    }
    produtos.add(produto);
  }

  public ArrayList<Produto> ler() {
    return produtos;
  }
}

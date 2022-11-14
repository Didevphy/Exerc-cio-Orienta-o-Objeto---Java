

public class produto {
  
  public String nome;
  public double preco;
  public int quantidade;

  public double valorTotalEsto() {
    return preco * quantidade;
  }
  public void addProdutos(int quantidade){
    this.quantidade += quantidade;
  }

  public void removerProdutos (int quantidade){
    this.quantidade -= quantidade;
  }

  public String toString(){
    return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades , total: $ " + String.format ("%.2f", valorTotalEsto());
  }
}
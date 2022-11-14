import java.util.Locale;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    produto produto = new produto();
    System.out.println("Entre com o produto: ");
    System.out.print("Nome: ");
    produto.nome = sc.nextLine();
    System.out.print("Preço: ");
    produto.preco = sc.nextDouble();
    System.out.print("Quantidade: ");
    produto.quantidade = sc.nextInt();

    System.out.println();
    System.out.println("Nome do Produto " + produto);

    System.out.println();
    System.out.println("Entre com número de produtos a adicionar no estoque: ");
    int quant = sc.nextInt();
    produto.addProdutos(quant);
    
    System.out.println();
    System.out.println("atualização do  Produto " + produto);

    System.out.println();
    System.out.println("Entre com número de produtos a remover do estoque: ");
    quant = sc.nextInt();
    produto.removerProdutos(quant);

    System.out.println();
    System.out.println("atualização do  Produto " + produto);
    
    sc.close();
  }
}
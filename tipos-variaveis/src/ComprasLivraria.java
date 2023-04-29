import java.util.Scanner;

public class ComprasLivraria {
  
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do teclado
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

        // Calcula o valor total da compra.
        double valorTotal = livro1.preco * livro1.quantidade + livro2.preco * livro2.quantidade;

        // Calcula o número de livros comprados.
        int numLivros = livro1.quantidade + livro2.quantidade;

        // Imprime o resultado.
        System.out.printf("Valor total da compra: %.2f%n", valorTotal);
        System.out.println("Número de livros comprados: " + numLivros);
    }
    
    System.out.println("Obrigado por comprar na nossa livraria!");
  }
  
  static class Livro {
    String nome;
    double preco;
    int quantidade;
    
    Livro(String nome, double preco, int quantidade) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
    }
  }
}


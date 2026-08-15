package exercicio2_POO;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Produto produto = new Produto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Produto: ");
        produto.nome = sc.nextLine();

        System.out.println("Digite o preco do Produto: ");
        produto.preco = sc.nextDouble();

        System.out.println("Digite a quantidade do Produto: ");
        produto.quantidade = sc.nextInt();

        produto.total_estoque();

        int adiciona;
        System.out.println("\nquanto voce quer aadicionar no estoque? ");
        adiciona = sc.nextInt();
        produto.adiciona_estoque(adiciona);

        int remove;
        System.out.println("\n quanto voce deseja remover no estoque? ");
        remove = sc.nextInt();
        produto.remover_estoque(remove);
    }
}

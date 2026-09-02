package exercicios__oo_sessao1ao8.exercicio2_POO;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //chamando o tipo "produto" para o sistema coda
        Produto produto = new Produto();
        //chamando a funcao scanner para input
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Produto: ");
        //chamando objetos e colocar nome
        produto.nome = sc.nextLine();

        System.out.println("Digite o preco do Produto: ");
        produto.preco = sc.nextDouble();

        System.out.println("Digite a quantidade do Produto: ");
        produto.quantidade = sc.nextInt();

        //chamando uma funcao do objeto para imprimir total de estoque
        //produto.total_estoque();


        //estou utilizando o metodo TOSTRING para transformar o objeto produto em string,
        //porque println le strings
        System.out.println(produto);

        /*
        int adiciona;
        System.out.println("\nquanto voce quer adicionar no estoque? ");
        adiciona = sc.nextInt();
        produto.adiciona_estoque(adiciona);


        int remove;
        System.out.println("\n quanto voce deseja remover no estoque? ");
        remove = sc.nextInt();
        produto.remover_estoque(remove);
        */
    }
}

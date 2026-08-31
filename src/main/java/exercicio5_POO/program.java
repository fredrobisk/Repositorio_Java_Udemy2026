package exercicio5_POO;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Aluno Aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        Aluno.nome = sc.nextLine();
        System.out.println("Digite a nota 1: ");
        Aluno.nota1= sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        Aluno.nota2= sc.nextDouble();
        System.out.println("Digite a nota 3: ");
        Aluno.nota3= sc.nextDouble();

        Aluno.resultado_nota();

    }
}

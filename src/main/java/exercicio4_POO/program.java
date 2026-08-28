package exercicio4_POO;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario();

        f.nome = sc.nextLine();
        f.salario_bruto = sc.nextDouble();
        f.imposto = sc.nextDouble();

        f.dados_funcionario();

        System.out.println("digite o valor do aumento? ");
        f.aumento = sc.nextDouble();
        f.aumento_salario();


    }
}

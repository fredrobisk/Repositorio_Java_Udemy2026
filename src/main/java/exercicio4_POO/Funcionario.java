package exercicio4_POO;

public class Funcionario {
    public String nome;
    public double salario_bruto;
    public double imposto;
    public double aumento;

    public void dados_funcionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + (salario_bruto - imposto));
    }
    public void aumento_salario() {
        double salarioLiquido = salario_bruto - imposto;
        double valorAumento = salarioLiquido * (aumento / 100);
        double novoSalario = salarioLiquido + valorAumento;

        System.out.println("Salário com acréscimo de " + aumento + "%: " + novoSalario);
    }

}

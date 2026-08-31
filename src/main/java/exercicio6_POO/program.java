package exercicio6_POO;

import java.util.Scanner;



public class program {
    public static void main(String[] args) {
        double dolar,dolar_final;
        Scanner sc = new Scanner(System.in);

        System.out.println("QUal o valor do dolar?");
        dolar = sc.nextDouble();

        System.out.println("Quantos dolares voce deseja comprar?");
        dolar_final = sc.nextDouble();

        double reais = conversor_dolar.conversor(dolar,dolar_final);

        System.out.println("Valor pago em reais = "+reais);
    }
}

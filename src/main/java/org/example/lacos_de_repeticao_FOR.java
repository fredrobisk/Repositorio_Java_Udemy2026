package org.example;

import java.util.Scanner;

public class lacos_de_repeticao_FOR{

    public static void exercicio2(){
        int n,i,in_intervalo = 0, out_intervalo = 0,numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que sera a quantidade de numeros lidos: ");
        n = sc.nextInt();

        for(i =0 ; i<n;i++){
            System.out.println("Digite o numero: ");
            numero = sc.nextInt();

            if (numero >=10 && numero <=20){
                in_intervalo++;
            }
            else if (numero > 20){
                out_intervalo++;
            }
            else if (numero < 10 && numero > 0){
                out_intervalo++;
            }
            else  if (numero < 0){
                System.out.println(" invalido");
            }
        }

    }

    public static void exercicio1() {
    int i, leitor;

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um valor: ");
    leitor = sc.nextInt();

    for (i = 0; i < leitor; i++) {
        if (i % 2 != 0) {
            System.out.println("Valor impar "+i);
        }
    }
}

    public static void exercicioteste(){
    int leitor,i;

    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um valor: ");
    leitor = ler.nextInt();

    for(i = 0; i<leitor; i++){
        System.out.println("valor "+ i);
    }
}
    //start
    public static void main(String[] args) {

        //exercicioteste();
        //exercicio1();
         exercicio2();

    }
}

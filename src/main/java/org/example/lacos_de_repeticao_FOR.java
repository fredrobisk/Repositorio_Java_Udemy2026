package org.example;

import java.util.Scanner;

public class lacos_de_repeticao_FOR{


    public static void exercicio6(){
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }

        public static void exercicio5(){
        int n,fatorial = 1;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
           fatorial = fatorial * i;
        }

        System.out.println("numero fartorado "+ fatorial);
    }


    public static void exercicio3(){
        int N;
        double a,b,c,media;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos casos teremos");
        N = sc.nextInt();

        for (int i = 0; i <= N; i++) {

            System.out.println("digite o valor do primeiro dado");
            a = sc.nextDouble();
            System.out.println("digite o valor do segundo dado");
            b = sc.nextDouble();
            System.out.println("digite o valor do terceiro dado");
            c = sc.nextDouble();


            media = (a * 2 + b * 3 +c * 5)/10;

            System.out.printf("%.2f%n",media);
            }
        }

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
            else if(numero < 0){
                System.out.println("nnumero invalido");
                break;
            }
            else {
                out_intervalo++;
            }
        }

        System.out.println("Numeros dentro do intervalo: "+in_intervalo);
        System.out.println("Numeros fora do intervalo: "+out_intervalo);
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
        //exercicio2();
        //exercicio3();
        //exercicio5();
         exercicio6();
    }
}

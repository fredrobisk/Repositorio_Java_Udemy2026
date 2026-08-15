package exercicios_iniciais_de_programacao;

import java.util.Scanner;

public class funcoes_if {

    public static void exercicio8(){

            double renda;
            double imposto = 0;

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o valor da renda:");
            renda = entrada.nextDouble();

            if (renda <= 2000){
                System.out.println("Isento");

            } else if (renda <= 3000){
                imposto = (renda - 2000) * 0.08;
                System.out.printf("R$ %.2f%n", imposto);

            } else if (renda <= 4500){
                imposto = (1000 * 0.08); // faixa 2000 até 3000
                imposto += (renda - 3000) * 0.18;
                System.out.printf("R$ %.2f%n", imposto);

            }
            else {
                imposto = (1000 * 0.08); // 2000 até 3000
                imposto += (1500 * 0.18); // 3000 até 4500
                imposto += (renda - 4500) * 0.28;
                System.out.printf("R$ %.2f%n", imposto);
            }
        }


    public static void exercicio7(){
        double x,y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        x = sc.nextDouble();

        System.out.println("Digite o valor de y: ");
        y = sc.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("o valor se encontra no quadrante Q1");
        }
        else if (x > 0 && y < 0){
            System.out.println("o valor se encontra no quadrante Q4");
        }
        else if (x < 0 && y > 0){
            System.out.println("o valor se encontra no quadrante Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("o valor se encontra no quadrante Q3");
        }
        else if (x == 0 && y == 0){
            System.out.println("ORIGEM");
        }
        else{
            System.out.println("valores invalidos");
        }

    }


    public static void exercicio6(){

        double entrada;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        entrada = sc.nextDouble();

        if (entrada > 0 && entrada < 25){
            System.out.println("intervalo (0,25)");
        }
        else if (entrada > 25 && entrada < 50){
            System.out.println("intervalo (25,50)");
        }
        else if (entrada > 50 && entrada < 75){
            System.out.println("intervalo (50,75)");
        }
        else if (entrada > 75 && entrada < 100){
            System.out.println("intervalo (75,100)");
        }
        else
            System.out.println("fora do intervalo");
    }


    public static void exercicio5(){

        System.out.println("\n **Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A\n" +
                "seguir, calcule e mostre o valor da conta a pagar. \n");

        double cachorro_quente = 4.00;
        double X_Salada = 4.50;
        double X_Bacon = 5.00;
        double torrada_simples = 2.00;
        double refrigerante = 1.50;

        int item,quantidade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual item voce deseja?");
        item = entrada.nextInt();

        System.out.println("qual a quantidade do item escolhido?(código 1-5)");
        quantidade = entrada.nextInt();

        if (item == 1){
           double valor_final = cachorro_quente * quantidade;
            System.out.println("O valor final da compra eh "+valor_final);
        }

        else if (item == 2){
            double valor_final = X_Salada * quantidade;
            System.out.println("O valor final da compra eh "+valor_final);
        }

        else if (item == 3){
            double valor_final = X_Bacon * quantidade;
            System.out.println("O valor final da compra eh "+valor_final);
        }

        else if (item == 4){
            double valor_final = torrada_simples * quantidade;
            System.out.println("O valor final da compra eh "+valor_final);
        }

        else if (item == 5){
            double valor_final = refrigerante * quantidade;
            System.out.println("O valor final da compra eh "+valor_final);
        }

        entrada.close();
    }


    /* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
     começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
    public static void exercicio4(){
        System.out.println("Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode\n" +
                "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.");

       int hora_inicial,hora_final, duracao;

       Scanner sc = new Scanner(System.in);
        System.out.println("Informe a hora de inicio:");
        hora_inicial = sc.nextInt();

        System.out.println("Informe a hora de fim:");
        hora_final = sc.nextInt();

       if(hora_inicial > hora_final){
           hora_inicial = 24 - hora_inicial;
           duracao = hora_final + hora_inicial;
           System.out.println("O tempo de duracao foi de " +duracao+ " horas");
       }
       else if(hora_inicial < hora_final){
           duracao = hora_final - hora_inicial;
           System.out.println("O tempo de duracao foi de " +duracao+ " horas");
       }
       else {
           System.out.println("O tempo foi de 24 horas");
       }

       sc.close();
    }

    /* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
      Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
      ordem crescente ou decrescente.*/
    public static void exercicio3(){
        System.out.println("""
                
                 **Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
                Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
                ordem crescente ou decrescente.
                """);
        int a,b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao multiplos");
        }
        else {
            System.out.println("Nao sao multiplos");
        }
        sc.close();
    }

    //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
    public static void exercicio2(){
        System.out.println(" **Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.\n");
        int x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        x = sc.nextInt();

        if (x % 2 == 0){
            System.out.println("Seu numero e par");
        }
        else{
            System.out.println("Seu numero e impar");
        }
        sc.close();
    }

    // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
    public static void exercicio1(){
        System.out.println(" **Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não\n");
        int x; //numero inteiro

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        x = sc.nextInt();

        if (x < 0){
            System.out.println("Seu numero " + x + " é negativo");
        }
        else {
            System.out.println("Seu numero "+ x +" é positivo");
        }
        sc.close();
    }

    public static void main(String[] args) {

        int entrada;
        System.out.println("qual exercicio voce quer fazer 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8");
        Scanner sc = new Scanner(System.in);
        entrada = sc.nextInt();

        if (entrada == 1){
            exercicio1();
        }
        else if (entrada == 2) {
            exercicio2();
        }
        else if (entrada == 3) {
            exercicio3();
        }
        else if (entrada == 4) {
            exercicio4();
        }
        else if (entrada == 5){
            exercicio5();
        }
        else if (entrada == 6){
            exercicio6();
        }
        else if(entrada == 7){
            exercicio7();
        }
        else if (entrada == 8){
            exercicio8();
        }
        sc.close();

        System.out.println("\nFINISH");
    }
}

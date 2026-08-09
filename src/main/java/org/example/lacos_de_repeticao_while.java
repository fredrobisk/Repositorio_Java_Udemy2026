package org.example;

import java.util.Scanner;

public class lacos_de_repeticao_while {


    public static void exercicioteste(){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while(x != 0){
            x = sc.nextInt();

        }

        sc.close();
    }

    /*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
    incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
    impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/
    public static void exercicio1(){

        Scanner sc = new Scanner(System.in);
        int senha;
        System.out.println("Digite a senha: ");
        senha = sc.nextInt();

        while(senha != 2002){
            System.out.println("Senha Incorreta \n");
            senha = sc.nextInt();
        }

        System.out.println("Senha Correta");

        sc.close();
    }

    /*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
    cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
    menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/
    public static void exercicio2(){
        int x = 1,y = 1;

        Scanner sc = new Scanner(System.in);

        while(x != 0 && y != 0) {
            System.out.println("Digite o valor de x?");
            x = sc.nextInt();

            System.out.println("Digite o valor de y?");
            y = sc.nextInt();

            if(x > 0 && y > 0){
                System.out.println("Primeiro Quadrante\n");
            }
            else if(x < 0 && y > 0){
                System.out.println("Segundo Quadrante\n");
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro Quadrante\n");
            }
            else if(x > 0 && y < 0){
                System.out.println("Quarto Quadrante\n");
            }
            else{
                System.out.println("valores invalidos\n");
            }
        }

        System.out.println("Processo Encerrado");

    }

    public static void exercicio3() {
        int alcool = 0, gasolina = 0, diesel = 0, fim = 0;

        Scanner sc = new Scanner(System.in);

        while (fim != 4) {
            System.out.println("Digite o codigo do que voce deseja Abastecer \n 1. Álcool \n 2. Gasolina \n 3. Diesel \n 4. Fim" +
                    "\n ->");
            switch (sc.nextInt()) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                case 4:
                    fim = 4;
                    break;
            }
        }

        System.out.println("estatistica do dia");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }

    public static void main(String[] args) {
         //exercicioteste();
         //exercicio1();
         //exercicio2();
           exercicio3();
    }
}

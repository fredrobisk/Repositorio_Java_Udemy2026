package Apllication;

import java.util.Locale;
import java.util.Scanner;

public class Scanner_SC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // permite usar pontos no float
        Scanner sc = new Scanner(System.in);//chamando a funcao scanner no projeto
        /* */


        int v; //declarando uma variavel INTEIRA
        String x,s1,s2,s3; //declarando uma variavel String
        double f; //declarando uma variavel do tipo float
        char h; //declarando uma variavel do tipo char(apenas 1 caracter)

        System.out.println("Digite 3 palavras, a cada palavra de 'ENTER': ");
        v = sc.nextInt();
        sc.nextLine(); //chamada para guardar quebra de linha e nao dar erro depois do INT
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: \n"+ v + "\n" + s1 + "\n" + s2 + "\n" + s3);


        //System.out.println("Digite um valor char: ");
        //h = sc.next().charAt(0);

        //utilize virgula
        //System.out.println("Digite um valor FLUTUANTE: ");
        //f = sc.nextDouble();

        //System.out.println("digite um valor INTEIRO:");
        // v = sc.nextInt();//chjamando a entrada de dados INT

        //System.out.println("digite um valor String:");
        //x = sc.next();//chamando a entrada de dados

        //System.out.println("\nO valor string digitado foi:" + x);
        //System.out.println("o valor inteiro digitado foi:" + v);
        //System.out.println("O valor flutuante digitado foi:" + f);
        //System.out.println("o valor char digitado: "+ h);
        sc.close();
    }
}
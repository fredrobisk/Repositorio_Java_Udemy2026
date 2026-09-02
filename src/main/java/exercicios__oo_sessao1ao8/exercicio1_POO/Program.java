package exercicios__oo_sessao1ao8.exercicio1_POO;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangulo y= new Triangulo();
        Triangulo x= new Triangulo();

        System.out.println("Insira os valores do Triangulo X");
        x.lado1 = sc.nextDouble();
        x.lado2 =sc.nextDouble();
        x.lado3 = sc.nextDouble();

        System.out.println("Insira os valores do Triangulo y");
        y.lado1 = sc.nextDouble();
        y.lado2 =sc.nextDouble();
        y.lado3 = sc.nextDouble();

        //chamando metodo para calcular a area dos triangulos
        double areaX = x.area();

        double areaY = y.area();

        System.out.println("Area de X: " + areaX);
        System.out.println("Area de Y: " + areaY);
    }
}

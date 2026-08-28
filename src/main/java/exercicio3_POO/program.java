package exercicio3_POO;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        retangulo retangulo = new retangulo();

        Scanner sc = new Scanner(System.in);

        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.println("AREA = "+retangulo.area());
        System.out.println("perimetro = "+retangulo.perimetro());
        System.out.println("Diagonal = "+retangulo.diagonal());
    }
}

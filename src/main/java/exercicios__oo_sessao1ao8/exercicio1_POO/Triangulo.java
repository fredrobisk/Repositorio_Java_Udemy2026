package exercicios__oo_sessao1ao8.exercicio1_POO;

public class Triangulo {

    //adicionando atributos publicos para ser acessado ao Program
    public double lado1, lado2, lado3;

    //criando metodo que para calcular a area do triangulo
    public double area(){
        double p = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }


}

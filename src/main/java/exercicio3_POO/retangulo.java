package exercicio3_POO;

public class retangulo {
    public double altura;
    public double largura;

    public double area(){
        return altura * largura;
    }

    public double perimetro(){
        return 2 * (largura + altura);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
}

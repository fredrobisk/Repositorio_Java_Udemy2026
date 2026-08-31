package exercicio5_POO;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public void resultado_nota(){
        double nota_final = nota1 + nota2 + nota3;
        if (nota_final >= 60){
            System.out.println("Final Grade = " + nota_final +
                    "\nPASS");
        }
        else{
            System.out.println("Final Grade = " + nota_final + "\nFAILED\n");
            nota_final -= 60;
            System.out.println("MISSING" + nota_final + "POINTS");

        }

    }
}

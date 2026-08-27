package exercicio2_POO;

public class Produto {

    public String nome;
    public Double preco;
    public int quantidade;

    public void total_estoque(){
        System.out.println(" Nome  -> "+ nome);
        System.out.println(" Preco -> R$"+ preco);
        System.out.println(" Quantidade -> "+ quantidade);

        double total = preco * quantidade;
        System.out.printf("\nO valor total do produto no Estoque -> R$%.2f\n", total);
    }

    public void adiciona_estoque(int adiciona){
        quantidade += adiciona;
        System.out.println(" Resultado final do estoque " + quantidade);
        double total = preco * quantidade;
        System.out.printf(" O valor final de quantidade no estoque eh: R$%.2f ", total);

    }

    public void remover_estoque(int remover){
        quantidade -= remover;
        System.out.println(" Resultado final do estoque " + quantidade);
        double total = preco * quantidade;
        System.out.printf("o valor final de quatindade no estoque eh: R$%.2f", total);
    }

    public String toString(){
        return nome
                +", $ "
                +String.format("%.2f",preco)+
                ", " +quantidade
                +" units, Total: $ "
                +preco*quantidade;
    }
}

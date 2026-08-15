package exercicios_iniciais_de_programacao;

public class funcoes_string {
    public static void main(String[] args) {

        String original =" abcde FGHIJ ABEC abc DEFG   ";

        //funcao para deixar toda string minuscula
        String s01 = original.toLowerCase();

        //funcao para deixar toda string maiuscula
        String s02 = original.toUpperCase();

        //retira os espaços desncessarios
        String s03 = original.trim();

        //corta um caracter da string
        String s04 = original.substring(2);

        //corta separadamente onde deseja
        String s05 = original.substring(0, 2);

        //troca de lugar, por exemplo: sempre que encontrar um a minusculo troque por x
        String s06 = original.replace('a','x');

        //Testando a funcao Split
        String palavra = "potato aplle lemon";

        String[] vetor = palavra.split(" ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }


    }
}

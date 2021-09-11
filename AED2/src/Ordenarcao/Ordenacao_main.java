package Ordenarcao;

public class Ordenacao_main {

    private static Ordenacao Ordernar = new Ordenacao();

    public static void main(String[] args){
        int[] vetor = Ordernar.geradorAleatorio(100, 99);

        System.out.println(Ordernar.exibirVetor(vetor));
    }
}

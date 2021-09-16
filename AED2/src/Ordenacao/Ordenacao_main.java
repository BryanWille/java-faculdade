package Ordenacao;

public class Ordenacao_main {

    public static void main(String[] args) {
        Ordenacao ord = new Ordenacao();

        int[] teste = ord.gerarVetor(100, 5);

        System.out.println(ord.exibirVetor(teste));

    }
}
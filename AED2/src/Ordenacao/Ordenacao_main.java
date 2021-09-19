package Ordenacao;

public class Ordenacao_main {

	private static Ordenacao ord;

	public static void main(String[] args) {
		ord = new Ordenacao();

		int[] numeros = ord.geradorAleatorio(20, 100);

		System.out.println("Vetor:     " +ord.exibirVetor(numeros));
		int[] Bubble = ord.bubbleSort(numeros);
		int[] Insertion = ord.insertionSort(numeros);
		int[] Quick = ord.quickSort(numeros, 0, numeros.length-1);
		System.out.println("Bubble:    " +ord.exibirVetor(Bubble));
		System.out.println("Insertion: " +ord.exibirVetor(Insertion));
		System.out.println("QuickSort: " +ord.exibirVetor(Quick));
	}
}
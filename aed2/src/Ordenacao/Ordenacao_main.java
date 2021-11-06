package Ordenacao;

public class Ordenacao_main {

	private static Ordenacao ord;

	public static void main(String[] args) {
		ord = new Ordenacao();

		int[] numeros = ord.geradorAleatorio(20, 100);
		int[] teste = ord.geradorAleatorio(20, 100);

		System.out.println("Vetor:     " +ord.exibirVetor(numeros));
		int[] Bubble = ord.bubbleSort(numeros);
		int[] Insertion = ord.insertionSort(numeros);
		int[] InsertionReverso = ord.insertionSort_Decrescente(teste);
		int[] Quick = ord.quickSort(numeros, 0, numeros.length-1);
		int[] Merge = ord.mergeSort(numeros, 0, numeros.length-1);
		System.out.println("Bubble:     " +ord.exibirVetor(Bubble));
		System.out.println("Insertion:  " +ord.exibirVetor(Insertion));
		System.out.println("InsertionR: " +ord.exibirVetor(InsertionReverso));
		System.out.println("Quick:      " +ord.exibirVetor(Quick));
		System.out.println("Merge:      " +ord.exibirVetor(Merge));
	}
}
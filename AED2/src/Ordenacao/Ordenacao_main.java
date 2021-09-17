package Ordenacao;

public class Ordenacao_main {

	private static Ordenacao ord;
	
	public static void main(String[] args) {
		ord = new Ordenacao();
		
		int[] numeros = ord.geradorAleatorio(20, 99);
		
		System.out.println("Vetor: " +ord.exibirVetor(numeros));
		numeros = ord.bubbleSort(numeros);
		System.out.println("Bubble Sort: " +ord.exibirVetor(numeros));
	}
}
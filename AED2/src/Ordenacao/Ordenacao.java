package Ordenacao;

import java.util.Random;

public class Ordenacao {

	public Ordenacao() {

	}

	public int[] geradorAleatorio(int tamanhoVet, int digitos) {
		Random random = new Random();
		return random.ints(0, digitos).limit(tamanhoVet).toArray();
	}

	public String exibirVetor(int[] vetor) {
		String exibir = "";
		for (int i = 0; i < vetor.length; i++) {
			exibir += vetor[i] + " ";
		}
		return exibir;
	}

	public int[] bubbleSort(int[] vetor) {
		int temp;
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < (vetor.length-1); j++) {
				if(vetor[j] < vetor[j+1]) {
					temp = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = temp;
				}
			}
		}
		return vetor;
	}

	public int[] bubbleSort_Decrescente(int[] vetor) {
		int temp;
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < (vetor.length-1); j++) {
				if(vetor[j] < vetor[j+1]) {
					temp = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = temp;
				}
			}
		}
		return vetor;
	}
	
	
	public int[] insertionSort(int[] vetor) {
		int chave, j;
		for(int i = 1; i < vetor.length; i++) {
			chave = vetor[i];
			j = i - 1;
			while (j >= 0 && vetor[j] > chave) {
				vetor[j+1] = vetor[j];
				j = j -1;
			}
			vetor[j+1] = chave;
		}
		return(vetor);
	}
	
	public int[] insertionSort_Decrescente(int[] vetor) {
		int chave, j;
		for(int i = 1; i < vetor.length; i++) {
			chave = vetor[i];
			j = i - 1;
			while (j >= 0 && vetor[j] < chave) {
				vetor[j+1] = vetor[j];
				j = j -1;
			}
			vetor[j+1] = chave;
		}
		return(vetor);
	}
	 
	public int[] quickSort(int[] vetor) {

	}

	/*
	public int[] mergeSort(int[] vetor) {

	} */
}

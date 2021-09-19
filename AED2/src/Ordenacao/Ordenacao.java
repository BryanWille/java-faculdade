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
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < (vetor.length - 1); j++) {
                if (vetor[j] < vetor[j + 1]) {
                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        return vetor;
    }

    public int[] bubbleSort_Decrescente(int[] vetor) {
        int temp;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < (vetor.length - 1); j++) {
                if (vetor[j] < vetor[j + 1]) {
                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        return vetor;
    }

    public int[] insertionSort(int[] v) {
        int chave, j;
        for(int i = 1; i < v.length; i++) {
            chave = v[i];
            j = i - 1;
            while(j >= 0 && v[j] > chave) {
                v[j+1] = v[j];
                j -= 1;
            }
            v[j+1] = chave;
        }
        return v;
    }

    public int[] insertionSort_Decrescente(int[] vetor) {
        int chave, j;
        for (int i = 1; i < vetor.length; i++) {
            chave = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] < chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
        return (vetor);
    }

    public int[] quickSort(int[] vetor, int inicio, int fim) {
        if(inicio < fim ) {
            int sep = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, sep - 1);
            quickSort(vetor, sep + 1, fim);
        }
        return vetor;
    }

    private int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int f = fim;
        int i = inicio + 1;
        while(i < f) {
            if(vetor[i] < pivo) {
                i ++;
            } else if (pivo < vetor[f]) {
                f --;
            } else {
                int troca = vetor[f];
                vetor[f] = vetor[i];
                vetor[i] = troca;
                i ++;
                f --;
            }

        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;

        return f;

    }

    /*
     * }
     *
     *
     * public int[] mergeSort(int[] vetor) {
     *
     * }
     */
}

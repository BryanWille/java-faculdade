package Ordenacao;

import java.util.Random;

public class Ordenacao {


    public int[] gerarVetor(int tamanhoVet, int digitos) {
        Random random = new Random();
        return random.ints(0, digitos).limit(tamanhoVet).toArray();
    }

    public String exibirVetor (int[] vetor) {
        String exibir = "";
        for(int i = 0; i <= vetor.length; i++) {
            exibir += i +"\n";
        }
        return exibir;
    }
}

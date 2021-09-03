package Ordenarcao;

import java.util.*;

public class Ordenacao {

    public int[] geradorAleatorio(int tamanhoVet, int digitos ){
        Random random = new Random();
        return random.ints(0, digitos).limit(tamanhoVet).toArray();
    }

    public String exibirVetor(int[] vetor){
        String exibir = "";
        for(int cont = 0; cont < vetor.length; cont++){
            exibir += cont +"\n";
        }
        return exibir;
    }
}

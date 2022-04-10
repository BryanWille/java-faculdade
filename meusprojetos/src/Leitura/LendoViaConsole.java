package Leitura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LendoViaConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader arquivo = new InputStreamReader(System.in);
        BufferedReader leitura = new BufferedReader(arquivo);
        int[] cpf = new int[3];
        for(int i = 0; i < cpf.length; i++) {
            System.out.println("Digite o CPF de " +(i+1) +".a:");
            cpf[i] = Integer.parseInt(leitura.readLine());
        }
    }
}

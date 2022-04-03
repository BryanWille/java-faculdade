package Exercicios;

import java.io.*;

public class Exerc3 {
    public static void main(String[] args) throws IOException {
        Reader arquivo = new FileReader("nomes.txt");
        BufferedReader texto = new BufferedReader(arquivo);
        int contLinhas = 1, contChar = 0, whichChar = 0;
        for (int i = 0; (whichChar = texto.read()) != -1; i++) {
            contChar++;
            if (whichChar == 13) {
                contChar++;
                whichChar = texto.read();
                if(whichChar == 10){
                    contChar++;
                    contLinhas++;
                }
            }

        }
        System.out.println("Quantidade de caracteres: " + contChar);
        System.out.println("Quantidade de linhas: " +contLinhas);
    }
}

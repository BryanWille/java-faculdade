package Exercicios;

import java.io.*;

public class Exerc3 {
    public static void main(String[] args) throws IOException {
        Reader arquivo = new FileReader("nomes.txt");
        BufferedReader texto = new BufferedReader(arquivo);
        int contLinhas = 0, contChar = 0;
        String linha = texto.readLine();
        while (linha != null){
            contLinhas++;
            contChar += linha.length();
            linha = texto.readLine();
        }
        System.out.println("Quantidade de caracteres: " + contChar);
        System.out.println("Quantidade de linhas: " +contLinhas);
    }
}

package Exercicios;

import java.io.*;

public class Exerc1 {
    public static void main(String[] args) throws IOException {

        File nomes = new File("nomes.txt");
        FileInputStream ler = new FileInputStream(nomes);

        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println(" Char  :  ASCII");
        System.out.println("=-=-=-=-=-=-=-=-=-=");

        for (int i = 0; i < nomes.length(); i++) {
            int valor = ler.read();
            char letra = (char) valor;
            System.out.println("   "+letra + "   :  " + valor);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=");
    }
}

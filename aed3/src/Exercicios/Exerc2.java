package Exercicios;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Exerc2 {
    public static void main(String[] args) throws IOException {
        FileReader arquivo = new FileReader("nomes.txt");
        int index = 0, cont = 0;
        while((index = arquivo.read()) != -1){
            char letra = (char) index;
            if(Character.isWhitespace(letra)){
                cont++;
            }
        }
        System.out.println("Espaços em branco: " +cont);
    }
}
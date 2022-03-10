package Exercicios;
import java.io.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:/Users/ynosp/IdeaProjects/java-faculdade/aed3/src/teste.txt");
        int tot = 0, whiteSpace = 0, cont;

        while((cont = file.read()) != -1){
            tot++;
            if(Character.isWhitespace((char) cont)) //Objeto Character
                whiteSpace++;
        }
        file.close();
        System.out.println("Total: " +tot +" bytes.");
        System.out.println("Espaços em branco: " +whiteSpace);
    }
}

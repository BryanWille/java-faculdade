package Exercicios;
import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        //FileInputStream txt = new FileInputStream(args[0]); //Colocar argumentos via IDE > Ex1 do lado do martelo > Edit Configurations > Arguments > Expandir > Entre aspas e com espaço de ponto vírgula.
        FileInputStream txt = new FileInputStream("C:/Users/ynosp/IdeaProjects/java-faculdade/aed3/src/teste.txt");

        int value, total = 0;

        while ((value = txt.read()) != -1){ // Recebimento de varíavel no argumento lógico.
            System.out.printf("%s: %d \n", (char) value, value); // (char) value transforma o int em char (ASCII) e o value é número do digito.
            total++;
        }
        txt.close();
        System.out.printf("Total: %d bytes", total);
    }
}

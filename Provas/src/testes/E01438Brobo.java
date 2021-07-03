package testes;//Bryan Wille Souto Braga

import java.util.Objects;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class E01438Brobo {
    public static void main(String[] args) {
        int auxi = 0;
        String[][] livros = new String[26][2], bolha = new String[1][2];
        Scanner keyb = new Scanner(E01438Brobo.class.getResourceAsStream("debug2.txt"));
        while (keyb.hasNextLine()){
            livros[auxi][0] = keyb.nextLine();
            livros[auxi][1] = keyb.nextLine();
            auxi += 1;
        }
        for (int cont = 0; cont < livros.length; cont++) {
            for (int aux = 0; aux < livros.length - 1; aux++) {
                if (Integer.parseInt(livros[aux][1]) > Integer.parseInt(livros[aux + 1][1])) {
                    bolha[0][0] = livros[aux][0];
                    bolha[0][1] = livros[aux][1];
                    livros[aux][0] = livros[aux + 1][0];
                    livros[aux][1] = livros[aux + 1][1];
                    livros[aux + 1][0] = bolha[0][0];
                    livros[aux + 1][1] = bolha[0][1];
                }
            }
        }
        for (int cont = 0; cont < livros.length; cont++) {
            if (Integer.parseInt(livros[cont][1]) > 1001 && 1100 > Integer.parseInt(livros[cont][1])) {
                System.out.printf("\nLivro: %s \nCódigo: %s \n", livros[cont][0], livros[cont][1]);
            }
        }
        keyb.close();
    }
}

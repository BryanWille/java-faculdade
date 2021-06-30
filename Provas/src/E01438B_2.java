//Bryan Wille Souto Braga

import java.util.Scanner;
import java.util.Arrays;

public class E01438B_2 {
    public static void main(String[] args) {
        String[] nome = new String[10];
        int[] codigo = new int[nome.length];
        int conta = 0;
        Scanner keyb = new Scanner(E01438B_2.class.getResourceAsStream("debug.txt"));
        while (keyb.hasNextLine()) {
            nome[conta] = keyb.nextLine();
            codigo[conta] = Integer.parseInt(keyb.nextLine());
            conta += 1;
        }
        String[] livro = new String[nome.length];
        for (int cont = 0; cont < nome.length; cont++) {
            livro[cont] = nome[cont];
        }
        Arrays.sort(nome);
        for (int cont = 0; cont < nome.length; cont++) {
            // System.out.println(livro[cont] + " x " + nome[cont] + " cod: " +codigo[cont]);
            for (int aux = 0; aux < nome.length; aux++) {
                if (livro[cont].equals(nome[aux]) && (codigo[aux] > 1001 && 1100 > codigo[aux])) {
                    System.out.printf("\nLivro: %s \nCódigo: %d \n", nome[aux], codigo[aux]);
                    break;
                }
            }
        }
        keyb.close();
        System.out.println("FIM");
    }
}
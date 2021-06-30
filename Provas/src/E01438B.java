//Bryan Wille Souto Braga

import java.util.Scanner;
import java.util.Arrays;

public class E01438B {
    public static void main(String[] args) {
        String[] nome = new String[10];
        int[] codigo = new int[nome.length];
        int opcao;
        Scanner keyb = new Scanner(System.in);
        for (int cont = 0; cont < nome.length; cont++) {
            System.out.println((cont + 1) + ". Digite o nome do livro: ");
            nome[cont] = keyb.nextLine();
            System.out.println((cont + 1) + ". Digite o código do livro " + nome[cont] + ": ");
            codigo[cont] = keyb.nextInt();
            keyb.nextLine();
        }
        System.out.println("Livros entre 1001 e 1100 em ordem alfabética do nome: ");
        Arrays.sort(nome);
        for (String livros : nome) {
            for (int cont = 0; cont < nome.length; cont++) {
                if (livros.equalsIgnoreCase(nome[cont]) && (codigo[cont] > 1001 && 1100 > codigo[cont])) {
                    System.out.printf("\nLivro: %s \nCódigo: %d \n", nome[cont], codigo[cont]);
                    break;
                }
            }
        }
        keyb.close();
    }
}
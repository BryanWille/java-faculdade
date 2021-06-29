//Bryan Wille Souto Braga

import java.util.ArrayList;
import java.util.Scanner;

public class E01438B {
	public static void main(String[] args) {
		String[][] livros = new String[100][2];
		Scanner keyb = new Scanner(System.in);
		for (int cont = 0; cont < livros.length; cont++) {
			System.out.println("Digite o nome do livro: ");
			livros[cont][0] = keyb.nextLine();
			System.out.println("Digite o código do livro: ");
			livros[cont][1] = keyb.nextLine();
		}
		Liv
		keyb.close();
	}
}

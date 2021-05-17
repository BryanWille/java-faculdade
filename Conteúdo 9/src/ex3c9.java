import java.util.Scanner;

public class ex3c9 {
	public static void main(String[] args) {
		double somatorio = 0;
		int cont;
		Scanner keyb = new Scanner(System.in);
		System.out.println("Quantas repetições você quer? ");
		cont = keyb.nextInt();
		for (int c = 1; cont >= c; c++) {
			somatorio += (1 + Math.pow(4 * c, 1 / 2f)) / (3 * c);
		}
		System.out.println("O resultado da série foi de: " + somatorio);
		keyb.close();
	}
}

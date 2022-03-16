import java.util.Scanner;

public class exe3c8 {
	public static void main(String[] args) {
		int x, y, exp = 1;
		Scanner keyb = new Scanner(System.in);
		System.out.println("Vamos calcular o valor de x elevado a y de um valor inteiro positivo!");
		System.out.println("\nDigite o valor de x: ");
		x = keyb.nextInt();
		System.out.println("Digite o valor de y: ");
		y = keyb.nextInt();
		for (int contador = 1; y >= contador; contador++) {
			exp *= x;
		}
		System.out.println(exp);
		keyb.close();
	}
}

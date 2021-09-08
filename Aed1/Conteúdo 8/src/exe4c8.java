import java.util.Scanner;

public class exe4c8 {
	public static void main(String[] args) {
		double x, n, serie, total = 0;
		Scanner keyb = new Scanner(System.in);
		System.out.println("Digite o valor de x da serie: ");
		x = keyb.nextDouble();
		System.out.println("Digite o valor de repetições de n: ");
		n = keyb.nextDouble();
		for (int contador = 1; n >= contador; contador++) {
				serie = Math.pow(x, contador)/contador;
				total += serie;
				System.out.println(Math.pow(x, contador) +" / " +contador);
		}
		System.out.println(total);
		keyb.close();
	}
}

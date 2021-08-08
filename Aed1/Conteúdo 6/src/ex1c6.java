import java.util.Scanner;

public class ex1c6 {
	public static void main(String[] args) {
		double x, fx;
		Scanner keyb = new Scanner(System.in);
		System.out.print("Digite o valor de x: ");
		x = keyb.nextDouble();
		if (4 > x) 
			fx = (5 * x + 3.0) / Math.pow((16 - Math.pow(x, 2)), 1/2.0); 
		else
			if (x == 4) 
			fx = 0;
			else
				fx = (5 * x + 3) / Math.pow(Math.pow(x, 2) - 16, 1/2.0);
		keyb.close();
		System.out.print("\nO Seu resultado de x é: " +fx);
 }
}
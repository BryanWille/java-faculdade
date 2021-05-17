import java.util.Scanner;

public class ex9c6 {
	public static void main(String[] args) {
		double altura, pesoIdeal;
		String sexo;
		Scanner keyb = new Scanner(System.in);
		System.out.println("Vamos calcular o seu peso ideal!");
		System.out.print("\nQual o seu sexo? [M/F] ");
		sexo = keyb.nextLine();
		System.out.print("\nQual a sua altura em metros: ");
		altura = keyb.nextDouble();
		if (sexo.equalsIgnoreCase("F")) {
			pesoIdeal = 62.1 * altura - 44.7;
		} else {
			pesoIdeal = 72.7 * altura - 58;
		}
		System.out.println("O Seu peso ideal é: " +pesoIdeal);
		System.out.println("Fim!");
		keyb.close();
	}
}

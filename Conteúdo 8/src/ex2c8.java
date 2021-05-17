import java.util.Scanner;

public class ex2c8 {
	public static void main(String[] args) {
		int notaFinal, faltas, contador;
		String status;
		for (contador = 1; contador <= 50; contador++) {
			Scanner keyb = new Scanner(System.in);
			System.out.print("Digite a nota: ");
			notaFinal = keyb.nextInt();
			if (notaFinal == -1) {
				break;
			}
			System.out.print("Digite o número de faltas: ");
			faltas = keyb.nextInt();
			if (notaFinal >= 65 && faltas <= 16) {
				status = "Aprovado!";
			} else {
				status = "Reprovado";
			}
			System.out.println("Foi " + status);
			keyb.close();
		}
	}
}
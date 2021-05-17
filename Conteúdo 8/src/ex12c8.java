import java.util.Scanner;

public class ex12c8 {
	public static void main(String[] args) {
		double faturamento;
		int codigo, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		Scanner keyb = new Scanner(System.in);
		System.out.println("Modelo - Código  - Preço Unitário");
		System.out.println("A2460  -    1    -   R$1.565,00  ");
		System.out.println("B2356  -    2    -   R$1.890,00  ");
		System.out.println("C3900  -    3    -   R$2.150,00  ");
		System.out.println("D4100  -    4    -   R$2.963,00  ");
		System.out.println("E6749  -    5    -   R$3.750,00  ");
		for (int contador = 1; 5 >= contador; contador++) {
			System.out.println("\nDigite o código do produto: ");
			codigo = keyb.nextInt();
			switch (codigo) {
			case 1:
				cont1 += 1565;
				break;
			case 2:
				cont2 += 1890;
				break;
			case 3:
				cont3 += 2150;
				break;
			case 4:
				cont4 += 2963;
				break;
			case 5:
				cont5 += 3750;
				break;
			}
		}
		faturamento = cont1 + cont2 + cont3 + cont4 + cont5;
		System.out.println("O Valor final do faturamento foi: " + faturamento);
		keyb.close();
	}
}

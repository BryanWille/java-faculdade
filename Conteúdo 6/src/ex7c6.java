import java.util.Scanner;
public class ex7c6 {
	public static void main(String[] args) {
		double salario, liquido, bruto;
		Scanner keyb = new Scanner(System.in);
		System.out.println("Vamos calcular o imposto de acordo com o sálario! ");
		System.out.print("Digite o salario: R$");
		salario = keyb.nextDouble();
		if (300 >= salario) {
			bruto = 500 + (salario * 0.70);
		} else {
			if( salario > 300 && 1000 >= salario) {
				bruto = 200 + (salario * 0.50);
			} else {
				bruto = salario * 0.30;
			}
		}
		keyb.close();
		liquido = bruto - (bruto * 0.25);
		System.out.print("O salário PL Líquido é de R$" +liquido);
	}
}

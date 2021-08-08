import java.util.Scanner;

public class exe5c8 {
	public static void main(String[] args) {
		String nome, codigo, cargo = "", menorNome = "", menorCargo = "";
		int repeticoes, engAcima = 0, contAdm = 0, outrosCinco = 0;
		double salario, salarioMinimo = 0, mediaAdm, salarioAdm = 0, menorSalario = 0;
		Scanner keyb = new Scanner(System.in);
		System.out.println("Quantos funcionários: ");
		repeticoes = keyb.nextInt();
		keyb.nextLine();
		for (int contador = 1; repeticoes >= contador; contador++) {
			System.out.println("\nDigite o nome do Engenheiro: ");
			nome = keyb.nextLine();
			System.out.printf("Digite o salário bruto de %s: R$", nome);
			salario = keyb.nextDouble();
			keyb.nextLine();
			System.out.printf("\nQual o código do cargo de %s?", nome);
			codigo = keyb.nextLine().toUpperCase();
			switch (codigo) {
			case "C":
				cargo = "Engenheiro Calculista";
				salarioMinimo = 2500;
				break;
			case "P":
				cargo = "Engenheiro Projetista";
				salarioMinimo = 4650;
				break;
			case "O":
				cargo = "Engenheiro de Obra";
				salarioMinimo = 3200;
				break;
			case "A":
				cargo = "Engenheiro Administrador";
				salarioMinimo = 5100;
				salarioAdm += salario;
				contAdm++;
				break;
			case "X":
				cargo = "Outros";
				if (salario > 5000);
				outrosCinco += 1;
				break;
			}
			if (!codigo.equalsIgnoreCase("X") && salarioMinimo > salario) {
				System.out.printf("\n%s recebendo %f no cargo de %s está abaixo do salário mínimo (%f)", nome,
						salario, cargo, salarioMinimo);
			} else if (!cargo.equalsIgnoreCase("X") && salario >= salarioMinimo) {
				engAcima += 1;
			}
			if (contador == 1 || menorSalario > salario) {
				menorSalario = salario;
				menorCargo = cargo;
				menorNome = nome;
			}
		}
		mediaAdm = salarioAdm / contAdm;
		System.out.println("Quantidade de engenheiros acima do sálario mínimo para seu cargo: " +engAcima);
		System.out.println("A média dos salários dos engenheiros de cargo administrador: " +mediaAdm);
		System.out.println("Quantidade de engenheiros de cargo Outros e que recebem acima de R$5000: " +outrosCinco);
		System.out.printf("%s teve o menor salário que foi de %f no cargo de %s", menorNome, menorSalario, menorCargo);
		keyb.close();
	}
}

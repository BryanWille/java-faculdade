import java.util.Scanner;

public class ex7c8 {
	public static void main(String[] args) {
		String maiorNome = "", nome;
		int dozeAnos = 0, acimaTrinta = 0, maiorIdade = 0, idade, soma = 0;
		double media;
		Scanner keyb = new Scanner(System.in);
		for (int cont = 1; 50 >= cont;cont ++) {
			System.out.println("Digite o nome do aluno: ");
			nome = keyb.nextLine();
			System.out.println("Digite a idade do aluno " +nome +":");
			idade = keyb.nextInt();
			keyb.nextLine();
			if (idade > maiorIdade) {
				maiorIdade = idade;
				maiorNome = nome;
			}
			if (12 >= idade) {
				dozeAnos += 1;
			} else if (idade > 30) {
				acimaTrinta += 1;
			}
			soma += idade;
		}
		media = (double) soma / 5;
		System.out.println("Alunos até 12 anos: " +dozeAnos);
		System.out.println("Alunos acima de 30 anos: " +acimaTrinta);
		System.out.println("A média das idades foi de: " +media);
		System.out.println("Aluno de maior idade: " +maiorNome);
		keyb.close();
	}
}

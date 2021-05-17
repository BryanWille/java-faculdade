import java.util.Scanner;

public class ex4c8 {
	public static void main(String[] args) {
		int idade, maior = 0, menor = 0;
		String nome;
		Scanner keyb = new Scanner(System.in);
		for (int contador = 1; 5 >= contador; contador++) {
			System.out.println(contador + " digite o nome: ");
			nome = keyb.nextLine();
			System.out.println(contador + " digite a idade de " + nome + ": ");
			idade = keyb.nextInt();
			keyb.nextLine();
			if (18 >= idade) {
				menor += 1;
			} else {
				maior += 1;
			}
		}
		keyb.close();
		System.out.println("O número de alunos até 18 anos é de: " +menor);
		System.out.println("O número de alunos acima de 18 anos é de: " +maior);
	}

}

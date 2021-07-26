import java.util.Scanner;

public class ex2c7 {
	public static void main(String[] args) {
		int nota1, nota2, nota3, media;
		String notaFinal = "";
		String nome;
		Scanner keyb = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		nome = keyb.nextLine();
		System.out.println("Qual foi a primeira nota de " +nome +" ?" );
		nota1 = keyb.nextInt();
		System.out.println("Qual foi a segunda nota de " +nome +" ? ");
		nota2 = keyb.nextInt();
		System.out.println("Qual foi a terceira nota de " +nome +" ? ");
		nota3 = keyb.nextInt();
		media = (nota1 + nota2 + nota3) / 3;
		switch (media) {
		case 9: case 10:
			notaFinal = "A";
			break;
		case 8:
			notaFinal = "B";
			break;
		case 7:
			notaFinal = "C";
			break;
		case 5: case 6:
			notaFinal = "D";
			break;
		case 1: case 2: case 3: case 4:
			notaFinal = "E";
			break;
		default:
			System.out.println("A média está invalida, verifique as notas e tente novamente!");
		}
		System.out.println("A nota final do Aluno " +nome +", foi " +media +" portanto o conceito foi " +notaFinal +"!");
		keyb.close();
	}

}
